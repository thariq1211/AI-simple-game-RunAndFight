import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aktor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aktor2 extends kredit
{
    /**
     * Act - do whatever the aktor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        pm pm = new pm();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(pm);
        }
    }    
}
