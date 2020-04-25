import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aktor1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aktor1 extends kredit
{
    /**
     * Act - do whatever the aktor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        analist analist = new analist();
        if(Greenfoot.mouseClicked(this)){
            getImage().setTransparency(0);
            Greenfoot.setWorld(analist);
        }
    }    
}
