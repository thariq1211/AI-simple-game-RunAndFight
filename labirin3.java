import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirin3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirin3 extends World
{

    /**
     * Constructor for objects of class labirin3.
     * 
     */
    public labirin3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(870,600, 1); 
        blok block;

        for (int i = 1 ; i < 43; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 580) ;
        }//bawah

        for (int i = 1 ; i < 18; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 20) ;
        }//atas1

        for (int i = 24 ; i < 43; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 20) ;
        }//atas2

        for (int i = 24 ; i < 28; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 200) ;
        }//garistidur1

        for (int i = 2 ; i < 5; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 200) ;
        }//garistidur1 

        for (int i = 9; i < 18; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 260) ;
        }//garistidur3

        for (int i = 28 ; i < 34; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 100) ;
        }//garistidur4

        for (int i = 28; i < 32; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 280) ;
        }//garistidur5
        
        for (int i = 20; i < 25; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 380) ;
        }//garistidur5

        for (int i = 10; i < 15; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 380) ;
        }//garistidur5
        
        for (int i = 2; i < 6; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 380) ;
        }//garistidur5
        
        for (int i = 2; i < 10; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 500) ;
        }//garistidur5
        
        for (int i = 6; i < 15; i++)
        {
            block = new blok() ;
            addObject(block, 20* i, 580) ;
        }//garistidur5
        
        
        //vertical
        for (int i = 1; i < 30 ; i++)
        {
            block = new blok() ;
            addObject(block, 860, 20* i) ;
        }//bawah

        for (int i = 1; i < 30; i++)
        {
            block = new blok() ;
            addObject(block, 20, 20* i) ;
        }//atas1

        for (int i = 2; i < 13 ; i++)
        {
            block = new blok() ;
            addObject(block, 240, 20* i) ;
        }//garis tinggi 2

        for (int i = 2; i < 7 ; i++)
        {
            block = new blok() ;
            addObject(block, 340, 20* i) ;
        }//garis tinggi 3

        for (int i = 2; i < 10 ; i++)
        {
            block = new blok() ;
            addObject(block, 480, 20* i) ;
        }//garis tinggi 5

        for (int i = 5; i < 15 ; i++)
        {
            block = new blok() ;
            addObject(block, 560, 20* i) ;
        }//garis tinggi 6

        for (int i = 8; i < 14 ; i++)
        {
            block = new blok() ;
            addObject(block, 160, 20* i) ;
        }//garis bawah 1

         for (int i = 19; i < 25 ; i++)
        {
            block = new blok() ;
            addObject(block, 300, 20* i) ;
        }//garis bawah 1
       
        for (int i = 18; i < 25 ; i++)
        {
            block = new blok() ;
            addObject(block, 500, 20* i) ;
        }//garis bawah 1
       
        
        for (int i = 17; i < 30 ; i++)
        {
            block = new blok() ;
            addObject(block, 400, 20* i) ;
        }//garis bawah 1
        
        for (int i = 20; i < 30 ; i++)
        {
            block = new blok() ;
            addObject(block, 600, 20* i) ;
        }//garis bawah 1
        
        for (int i = 12; i < 22 ; i++)
        {
            block = new blok() ;
            addObject(block, 700, 20* i) ;
        }//garis bawah 1
        musuh m1 = new musuh();
        addObject(m1,443,538);
        addObject(m1,51,538);
        addObject(m1,522,157);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playerl3 playerl3 = new playerl3();
        addObject(playerl3,62,76);
        playerl3.setLocation(55,70);
        finish finish = new finish();
        addObject(finish,615,228);
        musuh musuh = new musuh();
        addObject(musuh,533,130);
        musuh.setLocation(524,158);
        musuh musuh2 = new musuh();
        addObject(musuh2,65,547);
        musuh2.setLocation(56,541);
    }
}
