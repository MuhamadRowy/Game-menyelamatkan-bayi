import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ambulan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ambulan extends Actor
{
    /**
     * Act - do whatever the ambulan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    
    if(Greenfoot.isKeyDown("left")){
            turn(-5);
    }    
    if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("up")){
            move(5);
    }    
    Actor baby = getOneObjectAtOffset(0,0, baby.class);
    if(baby !=null){
        getWorld().removeObject(baby);
        score.baby++;
        
    }
    if(score.baby == 3){
        
         getWorld().addObject(new smile(), 300, 200);
        Greenfoot.stop();
    }
}
}