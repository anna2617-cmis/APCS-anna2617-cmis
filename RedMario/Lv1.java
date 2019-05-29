import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv1 extends World
{
    private Cirno cirno; 
    private Status status; 
    public Lv1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1240, 768, 1); 
        cirno = new Cirno(); 
        status = new Status ();

        prepare(); 
    }

    public void prepare(){
        addObject(cirno, 80, 600); 
        addObject(new Ground(), 414, 725); 
        addObject(new MoveBlock(), 1137, 725); 
        addObject(new Enemy(), 1150, 640); 
        addObject(new RecF(), 620, 480); 
        addObject(status, 100, 100);
    } 

    public Cirno getCirno(){
        return cirno; 
    }
}
