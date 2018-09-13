import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Annas_robot extends Robot
{
    public Annas_robot(){
        super(Color.PINK);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        
        if (isClearRight()){
            right();
        }else if (isClearDown()&&Math.random()<0.5){ 
            down(); 
        }else if (isClearUp()&&Math.random()<0.5){
            up();
        }else if (isClearLeft()&&Math.random()<0.5){
            left();

        }
    }
}
