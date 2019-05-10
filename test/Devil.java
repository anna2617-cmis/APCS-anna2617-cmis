import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Devil extends Actor
{
    /**
     * Act - do whatever the Devil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        setLocation(x,y); 
    }    
}
