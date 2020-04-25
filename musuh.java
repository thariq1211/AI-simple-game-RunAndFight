import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class musuh here.
 * 
 * @author (thor) 
 * @version (a version number or a date)
 */
public class musuh extends Actor
{
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;
    public String direction = "down";
public musuh(){
    
}
    private void gerak(){
        if(left){
            this.setLocation(this.getX()-5, this.getY());
            if(this.getX()% 4 == 0){
                this.setImage("1musuh-kiri.png");
            }else if (this.getX()% 4 == 1){
                this.setImage("musuh-kiri.png");
            }
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() + 5, getY() ) ;
        } else if (right){
            this.setLocation(this.getX()+5, this.getY());
             if(this.getX()% 4 == 0){
                this.setImage("1musuh-kanan.png");
            }else if (this.getX()% 4 == 1){
                this.setImage("musuh-kanan.png");
            }
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() - 5, getY() ) ; 
        } else if (up){
            this.setLocation(this.getX(), this.getY()-5);
            if(this.getY()% 4 == 0){
                this.setImage("1musuh-kanan.png");
            }else if (this.getY()% 4 == 1){
                this.setImage("musuh-kanan.png");
            }
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() , getY() + 5 ) ;
        } else {
            this.setLocation(this.getX(), this.getY()+5);
            if(this.getY()% 4 == 0){
                this.setImage("1musuh-kiri.png");
            }else if (this.getY()% 4 == 1){
                this.setImage("musuh-kiri.png");
            }
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() , getY() - 5 ) ;
        }
    }
    
    private void SetMove(){
        if(canMove(getX()-20, getY()) && canMove(getX()-20, getY()-20) && canMove(getX()-20, getY()+5)) {
            gerak(); left=true; right=false;
            up = false; down = false;
        }
        else if (canMove(getX()+20, getY()) && canMove(getX()+20, getY()-20) && canMove(getX()+20, getY()+5)){
            gerak(); right=true; left = false;
            up = false; down = false;
        }
        else if (canMove(getX(), getY()-20) && canMove(getX()-20, getY()-20) && canMove(getX()+20, getY()-5)){
            gerak(); down = true; up = false;
            left = false; right = false;
        }
        else if (canMove(getX(), getY()+20) && canMove(getX()-20, getY()+20) && canMove(getX()+20, getY()+5)){
            gerak(); up = true; down = false;
            left = false; right = false;
        }
    }
    
    private boolean getWallInFront()
    {
        GreenfootImage myImage = getImage();
        int distanceToFront = myImage.getWidth()/2;
        int xOffset =(int)Math.ceil(distanceToFront*Math.cos(Math.toRadians(getRotation())));
        int yOffset = (int)Math.ceil(distanceToFront*Math.sin(Math.toRadians(getRotation())));
        Actor wall = getOneObjectAtOffset(xOffset, yOffset, blok.class);
        return (wall!=null);
        
    }
    
    private boolean canMove(int X, int Y)
    {
        if(getWorld().getObjectsAt(X,Y, blok.class).isEmpty()) return true;
        return false;
    }
    
    private void random(){
        Actor blokTembok = getOneIntersectingObject(blok.class) ;
        if (blokTembok == null){
            move (4);
            if(this.getY()% 4 == 0){
                this.setImage("1musuh-kiri.png");
            }else if (this.getY()% 4 == 1){
                this.setImage("musuh-kiri.png");
            }
        } else {
        int rnd = Greenfoot.getRandomNumber(4);
        if(rnd == 0){
            left = true;
        } else if (rnd == 1){
            right = true;
        } else if (rnd == 2){
            up = true;
        } else {
            down = true;
        }      
        }
        gerak();
    }
    
    public void act() 
    {
        /*if(getWallInFront() == false){
            move(5);
        }else{
            int rnd = Greenfoot.getRandomNumber(3);
            if(rnd == 0){
            turn (90);    
            } else if (rnd == 1){
            turn (-90);
            } else {
            turn (180);
            }
        
        }*//*
        gerak();/*
        SetMove();*/
        random();
    }

}
