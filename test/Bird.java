import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("w")){
            turn(-3); 
        }
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("s")){
            turn(3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);  
        }
        move(3); 
    }  

    public int positionX(){
        return getX(); 
    }

    public int positionY(){
        return getY(); 
    }
}
