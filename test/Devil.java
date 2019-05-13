import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Devil extends Actor
{
    
    public void act() 
    {
        int x = getX(); 
        int y = getY(); 
        int bx = ((MyWorld)getWorld()).getBird().getX(); 
        int by = ((MyWorld)getWorld()).getBird().getY(); 
        double ranodm = Math.random(); 
        if (bx > x){
            x++; 
        }else{
            x--; 
        }
        
        if (by > y){
            y++; 
        }else{
            y--; 
        }
        move(3); 
    }    
}
