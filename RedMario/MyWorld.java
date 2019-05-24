import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Cirno cirno;     
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1240, 768, 1); 
        cirno = new Cirno(); 
        prepare(); 
    }
    
    public void prepare(){
        addObject(cirno, 620, 699); 
        
        addObject(new F1(), 40, 550); 
    } 
    
    public Cirno getCirno(){
        return cirno; 
    }
}
