import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playerl3 extends Actor
{
    /**
     * Act - do whatever the playerl3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public playerl3(){
    
     GreenfootImage myImage = getImage();
        int myNewHeight = 60;
        int myNewWidth = 20;
        myImage.scale(myNewWidth,myNewHeight);    
    }
    public void act() 
    {
     keyboardControls();
     bertemu();
        
        
       MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseDragEnded(this))
        {
            setLocation(mouse.getX(), mouse.getY());
        }
    }    
    public void keyboardControls() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
      
            if(this.getX()% 2 == 0){
                this.setImage("player(kiri).png");
            }else if (this.getX()% 2 == 1){
                this.setImage("player(kiri)jalan.png");
            }
            this.setLocation(this.getX()-5, this.getY());
            
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() + 5, getY() ) ;
            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            if(this.getX()% 2 == 0){
                this.setImage("player.png");
            }else if (this.getX()% 2 == 1){
                this.setImage("playerjalan.png");
            }    
            this.setLocation(this.getX()+5, this.getY());
            
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() - 5, getY() ) ;
        }
        if(Greenfoot.isKeyDown("up"))
        {
            if(this.getY()% 2 == 0){
                this.setImage("player.png");
            }else if (this.getY()% 2 == 1){
                this.setImage("playerjalan.png");
            }
                this.setLocation(this.getX(), this.getY()-5);
            
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() , getY() + 5 ) ;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            if(this.getY()% 2 == 0){
                this.setImage("player(kiri).png");
            }else if (this.getY()% 2 == 1){
                this.setImage("player(kiri)jalan.png");
            }
            this.setLocation(this.getX(), this.getY()+5);
            
            Actor aWallCell = getOneIntersectingObject(blok.class) ;
                   if (aWallCell != null)
                        setLocation (getX() , getY() - 5 ) ;
        }
        
       
    }
    public void bertemu()
    {
        Actor getmusuh = getOneIntersectingObject(musuh.class);
        if(getmusuh != null)
        {   level3 lvl3 = new level3();
            Greenfoot.setWorld(lvl3);
        }
    }
}
