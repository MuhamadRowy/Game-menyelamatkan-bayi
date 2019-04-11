import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jalan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jalan extends World
{

    /**
     * Constructor for objects of class jalan.
     * 
     */
    public jalan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(new score(),300,40);
        addObject(new ambulan(),20,100);
        addObject(new baby(),100,50);
        addObject(new baby(),150,200);
        addObject(new baby(),900,450);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gold gold = new gold();
        addObject(gold,218,26);
        gold.setRotation(90);
        
       
        
        
    }
}
