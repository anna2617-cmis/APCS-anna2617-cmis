import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor implements Movable, Attackable 
{
    private int health; 
    private boolean isLeft; 
    private int frame = 1; 
    private int animationCounter = 0; 
    private int speed; 
    private final int GRAVITY = 1; 
    private int velocity; 

    private GreenfootImage monL1 = new GreenfootImage("monL1.png");
    private GreenfootImage monL2 = new GreenfootImage("monL2.png");
    private GreenfootImage monL3 = new GreenfootImage("monL3.png");
    private GreenfootImage monR1 = new GreenfootImage("monR1.png");
    private GreenfootImage monR2 = new GreenfootImage("monR2.png");
    private GreenfootImage monR3 = new GreenfootImage("monR3.png");
    public Enemy(){
        isLeft = true; 
        health = 20; 
        speed = 3; 
    }

    public void moveLeft(){
        setLocation(getX() - speed, getY()); 
        if (animationCounter % 2 == 0){
            animateLeft();
            animationCounter = 0; 
        }
    } 

    public void moveRight(){
        setLocation(getX() + speed, getY()); 
        if (animationCounter % 2 == 0){
            animateRight();
            animationCounter = 0; 
        }
    } 

    public void fall(){
        setLocation(getX(),getY()+velocity);
        velocity += GRAVITY; 
    }

    public void animateLeft(){
        if(frame == 1){
            setImage(monL1); 
        }else if (frame == 2){
            setImage(monL2); 
            frame = 1; 
            return; 
        }
        frame ++; 
    }

    public void animateRight(){
        if(frame == 1){
            setImage(monR1); 
        }else if (frame == 2){
            setImage(monR2); 
            frame = 1; 
            return; 
        }
        frame ++; 
    }

    public void getKilled(){
        for (int a = 0; a < 5; a ++){
            setImage(monL3); 
        }
        getWorld().removeObject(this); 
    }

    public void deductHealth(int dmg){
        health -= dmg; 
    } 

    public void changeDirection(){
        if (isTouching(RecF.class))
            isLeft = !isLeft; 
    }

    public void getHit(){
        if (isTouching(Weapon.class) || isTouching(CrystalSplat.class)){
            deductHealth(5); 
        }
    }
    
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2 + 20, Floor.class);
        return under != null; 
    }
    
    public void checkFalling(){
        if (onGround()== false){
            fall(); 
        }
    }

    public void act() 
    {
        if (health == 0){
            getKilled(); 
        }
        changeDirection(); 
        checkFalling(); 
        if (isLeft){
            moveLeft(); 
        }else{
            moveRight(); 
        }
    }    
}