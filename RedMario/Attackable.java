import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attackable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Attackable 
{
    public void getKilled(); 
    public int deductHealth(int dmg); 
}
