import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aktor4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aktor4 extends kredit
{
    /**
     * Act - do whatever the aktor4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        programmer p = new programmer();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(p);
        }
    }    
}
