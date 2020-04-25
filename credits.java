import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credits extends World
{

    /**
     * Constructor for objects of class credits.
     * 
     */
    public credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(870, 600, 1);
    prepare();
}

private void prepare()
{
    back back = new back();
    addObject(back,741,534);
    back.setLocation(733,521);
}
}
