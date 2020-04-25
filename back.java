import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Actor 
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public void act() 
    {
         MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new MyWorld());
        }
        if (Greenfoot.mouseMoved(this)){
        this.setImage("BTbackH.jpg");
    }else{
        this.setImage("BTback.jpg");
    }
    }    
}
