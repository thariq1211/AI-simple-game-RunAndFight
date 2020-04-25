import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intruksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intruksi extends Actor
{
    /**
     * Act - do whatever the intruksi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new instructionWorld());
        }
        if (Greenfoot.mouseMoved(this)){
        this.setImage("BTinstructionH.png");
    }else{
        this.setImage("BTinstruction.png");
    }
    }    
}
