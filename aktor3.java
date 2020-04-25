import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aktor3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aktor3 extends kredit
{
    /**
     * Act - do whatever the aktor3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        designer design = new designer();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(design);
        }
    }    
}
