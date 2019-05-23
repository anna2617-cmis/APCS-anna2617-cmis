import greenfoot.*;  
import java.util.*;
public class Cirno extends Actor
{
    private int speed = 2; 
    private final int GRAVITY = 1; 
    private int velocity; 

    private GreenfootImage cirnoF1 = new GreenfootImage("cirnoF1.png"); 
    private GreenfootImage cirnoF2 = new GreenfootImage("cirnoF2.png"); 
    private GreenfootImage cirnoF3 = new GreenfootImage("cirnoF3.png"); 
    private GreenfootImage cirnoL1 = new GreenfootImage("cirnoL1.png"); 
    private GreenfootImage cirnoL2 = new GreenfootImage("cirnoL2.png");
    private GreenfootImage cirnoL3 = new GreenfootImage("cirnoL3.png");
    private GreenfootImage cirnoL4 = new GreenfootImage("cirnoL4.png");
    private GreenfootImage cirnoR1 = new GreenfootImage("cirnoR1.png");
    private GreenfootImage cirnoR2 = new GreenfootImage("cirnoR2.png");
    private GreenfootImage cirnoR3 = new GreenfootImage("cirnoR3.png");
    private GreenfootImage cirnoR4 = new GreenfootImage("cirnoR4.png");
    private int frame = 1; 
    private int animationCounter = 0; 
    
    public Cirno(){
        velocity = 0; 
    }

    public void moveLeft(){
        setLocation(getX()-speed, getY()); 
        if (animationCounter % 5 == 0){
            animateLeft();
            animationCounter = 0; 
        }
    }

    public void animateLeft(){
        if(frame == 1){
            setImage(cirnoL1); 
        }else if (frame == 2){
            setImage(cirnoL2);
        }else if (frame == 3){
            setImage(cirnoL3);
        }else if (frame == 4){
            setImage(cirnoL4);
            frame = 1; 
            return; 
        }
        frame ++; 
    }

    public void moveRight(){
        setLocation(getX() + speed, getY()); 
        if (animationCounter % 5 == 0){
            animateRight();
            animationCounter = 0; 
        }
    }

    public void animateRight(){
        if(frame == 1){
            setImage(cirnoR1); 
        }else if (frame == 2){
            setImage(cirnoR2);
        }else if (frame == 3){
            setImage(cirnoR3);
        }else if (frame == 4){
            setImage(cirnoR4);
            frame = 1; 
            return; 
        }
        frame ++; 
    }

    public void fall(){
        setLocation(getX(),getY()+velocity); 
        if (getY() > getWorld().getHeight() - 70){
            velocity = 0; 
        }else{
            velocity += GRAVITY; 
        }
    }

    public void jump(){
        velocity = -25; 
    }

    public void fire(){
        Weapon weapon = new Weapon(); 
        getWorld().addObject(weapon, getX(), getY()); 
        if(getImage().equals(cirnoL1)||getImage().equals(cirnoL2)||getImage().equals(cirnoL3)||getImage().equals(cirnoL4)){
            weapon.setRotation(180); 
            weapon.move(60); 
        }else{
            weapon.move(60); 
        }
    }

    public void control(){
        if (Greenfoot.isKeyDown("a")){
            moveLeft(); 
        }else if (Greenfoot.isKeyDown("d")){
            moveRight(); 
        }
        if (Greenfoot.isKeyDown("w")&&getY() > getWorld().getHeight() - 70){
            jump(); 
        }
        if ("space".equals(Greenfoot.getKey())){
            fire();  
        }
    }

    public void act() 
    {
        fall(); 
        control(); 
        animationCounter ++; 
    }    
}
