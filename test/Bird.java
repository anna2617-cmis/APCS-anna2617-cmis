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
        move(); 
    }  
    
    public void move(){
        int y = getY(); 
        int x = getX(); 
        if(Greenfoot.isKeyDown("w")){
            y--; 
        }
        if(Greenfoot.isKeyDown("a")){
            x--; 
        }
        if(Greenfoot.isKeyDown("s")){
            y++; 
        }
        if(Greenfoot.isKeyDown("d")){
            x++; 
        }
        setLocation(x,y); 
    }
    
    public int positionX(){
        return getX(); 
    }
    
    public int positionY(){
        return getY(); 
    }
}
