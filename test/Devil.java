import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Devil extends Actor
{

    public void act() 
    {
        int bx = ((MyWorld)getWorld()).getBird().getX(); 
        int by = ((MyWorld)getWorld()).getBird().getY(); 
        double ranodm = Math.random(); 
        height = 25; 
        width = 25; 
        turnTowards(bx,by); 
        move(1); 
        if(getX() == bx && getY() == by){
            image.scale(width, hight); 
        }
    }
}
