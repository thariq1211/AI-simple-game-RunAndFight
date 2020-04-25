import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCredit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCredit extends World
{
back back = new back();
    public MainCredit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(870, 600, 1); 
        
        addObject(back, 724, 520);
        aktor4 a4 = new aktor4();
        addObject(a4,564,499);
        a4.setLocation(622,145);
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        aktor1 a1 = new aktor1();
        addObject(a1,564,499);
        a1.setLocation(277,163);
        aktor2 a2 = new aktor2();
        addObject(a2,564,499);
        a2.setLocation(407,187);
        aktor3 a3 = new aktor3();
        addObject(a3,564,499);
        a3.setLocation(499,194);
        
    }
    
    
}
