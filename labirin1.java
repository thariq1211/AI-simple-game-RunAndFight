import greenfoot.*; 
public class labirin1 extends World
{
    int koordinat[][] =
        {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, //1
            {1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1}, //2
            {1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,2,0,0,0,1}, //3
            {1,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}, //4
            {1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,1}, //5
            {1,0,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1}, //6
            {1,0,1,1,0,1,2,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}, //7
            {1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1}, //8
            {1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1}, //9
            {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,2,0,0,0,1}, //10
            {1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,0,0,1}, //11
            {1,1,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1,1,0,0,1,0,0,0,1,0,0,0,0,1}, //12
            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,2,0,0,0,1,0,0,0,1,0,0,0,0,1}, //13
            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,0,0,0,0,1}, //14
            {1,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}, //15
            {1,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0,0,1,0,0,0,0,1}, //16
            {1,0,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1}, //17
            {1,0,0,0,1,0,1,2,1,0,0,1,0,0,1,0,1,1,1,0,1,0,0,0,1,0,0,0,0,1}, //18
            {1,0,0,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1}, //19
            {1,0,0,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,2,1,0,0,0,1,0,0,0,0,1}, //20
            {1,0,0,0,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0,0,0,1,0,0,0,0,1}, //21
            {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}, //22
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1}, //23
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1}, //24
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1}, //25
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,0,1,0,0,0,0,1}, //26
            {1,0,0,1,0,1,1,1,1,1,1,1,1,1,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,1}, //27
            {1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1}, //28
            {1,0,0,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1}, //29
            {1,1,1,1,0,1,0,0,0,2,1,0,0,1,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1}, //30
            {1,0,0,0,0,1,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1}, //31
            {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1}, //32
            {1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1}, //33
            {1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1}, //34
            {1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,2,1,0,0,0,1,0,0,0,0,1},//35
            {1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1},//36
            {1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1},//37
            {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1},//38
            {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1},//39
            {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1},//40
            {1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1},//41
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}//42
        };
    boolean[][] Field = new boolean[42][32]; int event = 0;

    public labirin1()
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
                /*  else if(koordinat[i][j] == 2)
                {
                addObject(new blok(), (i+1)*20-10, (j+1)*20-10);
                Field [i][j] =false;
                }*/
                else
                {
                    Field [i][j] =true; //true = untuk menunjukkan bahwa Valak dapat melewati jalan ini
                }
            }
        }

        object();
        prepare();
    }

    private void object()
    {
        player player = new player();
        addObject(player,11,552);
        musuh musuh = new musuh();
        addObject(musuh, 163, 53);
        musuh musuh2 = new musuh();
        addObject(musuh2, 464,538);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}