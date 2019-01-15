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
        if (getData(0) == 0){
            if(!isClearUp() && !isClearLeft()){
                setData(0, 1);
            }
            else if (!isClearUp()){
                left(); 
            }else if (!isClearLeft()){
                up(); 
            }else if (!isClearRight()){
                up(); 
            }else{
                left(); 
            }
        }else if (getData(1) == 0){
            if (!isClearUp() && !isClearRight()){
                setData(1, 1);
                down(); 
            }
            right(); 
            setData(2, getData(2)+1); 
        }else if (getData(3) < getData(2)){
            if (!isClearLeft() && getData(3) != getData(2)){
                setData(9, 1);
            }else if (!isClearLeft() && getData(3) == getData(2)){
                setData(3, 1); 
                down(); 
            }
            left(); 
        
        }
       

    }
}
