import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends Actor
{
    public play()
    {
    }
    public void act() 
    {
       // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new labirin1());
        }
        if (Greenfoot.mouseMoved(this)){
        this.setImage("BTplayH1.png");
    }else{
        this.setImage("BTplay.png");
    }
    }    
}
