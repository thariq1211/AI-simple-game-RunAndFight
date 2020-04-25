
   import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finish extends Actor
{
     public finish() 
    {
        getImage().setTransparency(0);
        GreenfootImage myImage = getImage();
        int height =50;
        int width =50;
        myImage.scale(width,height);
    }    
     public void act() 
    {
        // Add your action code here.
       
        if(this.isTouching(player.class)){
           getImage().setTransparency(255);
           Greenfoot.delay(40);
           Greenfoot.setWorld(new labirin2());
        }else if(this.isTouching(playerl2.class)){
           getImage().setTransparency(255);
           Greenfoot.delay(40);
           Greenfoot.setWorld(new labirin3());
        } else if (this.isTouching(playerl3.class)){
           getImage().setTransparency(255);
           Greenfoot.delay(40);
           Greenfoot.setWorld(new MyWorld());
        }
    }
}