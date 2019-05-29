import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Lose extends World
{

    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1240, 768, 1); 
        prepare(); 
    }
    
    public void prepare(){
        addObject(new Icon(), 620, 380); 
        addObject(new Retry(), 580, 500); 
        //addObject(new Status(), 800, 470); 
    }
}
