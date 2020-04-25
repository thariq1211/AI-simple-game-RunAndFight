import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    play play = new play();
    intruksi intruksi = new intruksi();
    credit kredit = new credit();
    GreenfootSound begin = new GreenfootSound("awal.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(870, 600, 1); 
        prepare();
        act();
        begin.playLoop();
    }
   private void prepare()
    {
       
       addObject(play, 659, 124);
       
       addObject(intruksi, 666,218);
       
       addObject(kredit, 659,310);
       
    }
    public void act()
    {
           
            onClick();
    }
           
    public void onClick()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(play))
        {
            begin.stop();
            Greenfoot.playSound("labirin1.mp3");
            labirin1 lab = new labirin1();
            Greenfoot.setWorld(lab);
            Greenfoot.delay(500);
        }
        if(Greenfoot.mouseClicked(intruksi))
        {
            begin.stop();
            Greenfoot.playSound("intruksi.mp3");
            instructionWorld h = new instructionWorld();
            Greenfoot.setWorld(h);
        }
        if(Greenfoot.mouseClicked(kredit))
        {
            begin.stop();
            Greenfoot.playSound("credit.mp3");
           MainCredit a = new MainCredit();
            Greenfoot.setWorld(a);
        }
    }
}
