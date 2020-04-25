import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credit extends Actor
{
    /**
     * Act - do whatever the credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new MainCredit());
        }
        if (Greenfoot.mouseMoved(this)){
        this.setImage("BTcreditH.png");
    }else{
        this.setImage("BTcredit.png");
    }
    }    
}
