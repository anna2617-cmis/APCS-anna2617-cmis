import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    Bird bird = new Bird();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare(); 
    }
    
    public void prepare(){
        addObject(bird, 300, 200); 
        Devil devil = new Devil(); 
        addObject(devil, 25, 25); 
    }
    
    public Bird getBird(){
        return bird; 
    }
}
