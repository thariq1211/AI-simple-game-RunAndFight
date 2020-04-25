import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends warstage
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        tarung tarung = new tarung();
        addObject(tarung,251,320);
        musuhtarung tarung2 = new musuhtarung();
        addObject(tarung2,691,320);
        aSkill askill = new aSkill();
        addObject(askill,133,541);
        sSkill sskill = new sSkill();
        addObject(sskill,236,541);
        dSkill dskill = new dSkill();
        addObject(dskill,341,541);
        HPfull hpfull = new HPfull();
        addObject(hpfull,170,40);
        hpfull.setLocation(145,23);
        enemyFull enemyfull = new enemyFull();
        addObject(enemyfull,752,24);
        enemyfull.setLocation(748,16);
        hpfull.setLocation(145,19);
    }
}
