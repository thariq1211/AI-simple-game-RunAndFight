import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirin2 extends World
{
    int koordinat[][] =
    {
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1},
        {1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,2,0,0,0,1},
        {1,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1},
        {1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,1,0,0,0,0,1},
        {1,0,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1},
        {1,0,1,1,0,1,2,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1},
        {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1},
        {1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,1,1,1,1,1,1},
        {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,1,0,1,2,0,0,0,1},
        {1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,1},
        {1,1,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1,1,0,0,1,0,1,0,1,0,1,1,1,1},
        {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,2,0,0,0,1,0,1,0,1,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,0,1},
        {1,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,1},
        {1,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,2,0,0,0,1,0,1},
        {1,0,0,0,1,0,1,2,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,1},
        {1,0,0,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,1,0,1,1,0,1,0,1},
        {1,0,0,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,2,1,0,1,0,0,0,0,1,0,1},
        {1,0,0,0,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1},
        {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,2,1,0,0,0,1,0,1},
        {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1},
        {1,0,0,1,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,0,0,0,1,0,1,0,1},
        {1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,1,1,1,1,1,0,1,0,1},
        {1,0,0,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1},
        {1,1,1,1,0,1,0,0,0,2,1,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,1,1,0,1},
        {1,0,0,0,0,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,2,1,1,1,1,1,1,0,1,0,1},
        {1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,1},
        {1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0,1},
        {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1},
        {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1},
        {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1},
        {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1},
    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    boolean[][] Field = new boolean[42][32]; int event = 0;
    
    public labirin2 ()
    {    
        super(840, 600, 1);
        blok block;       
        for (int i = 0; i < 42; i++)
        {
            for (int j = 0; j < 30; j++)
            {
                if (koordinat[i][j] == 1)
                {
                    Field [i][j] = false;   //false = untuk menunjukkan bahwa Valak tidak bisa melewati jalan
                    addObject(new tembok(),(i+1)*20-10, (j+1)*20-10);
                }
                else if(koordinat[i][j] == 2)
                {
                    addObject(new finish(), (i+1)*20-10, (j+1)*20-10);
                    Field [i][j] =true;
                }
                else
                {
                    Field [i][j] =true; //true = untuk menunjukkan bahwa Valak dapat melewati jalan ini
                }
            }
        }
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playerl2 player = new playerl2();
        addObject(player,828 ,50);
        musuh musuh = new musuh();
        addObject(musuh, 47, 53);
        musuh musuh2 = new musuh();
        addObject(musuh2, 503, 549);
        finish finish = new finish();
        addObject(finish,375,273);
        finish.setLocation(374,265);
    }
}
