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
     * 0 = left corner
     * 1 = width 
     * 2 = temp width 
     * 3 = go left 
     * 4 = go right 
     * 5 = shall it go down or not 
     * 8 = count the width 
     * 9 = hit the box 
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
        }else if (getData(8) == 0){
            right(); 
            setData(1, getData(1)+1); 
            if (!isClearRight()){
                setData(8, 1); 
            }
        }else if (getData(2) <= getData(1) && getData(9) == 0){
            if (getData(3) == 1 && getData(2) != getData (1)){
                setData(2, getData(2)+1);
                left(); 
                 
            }else if (getData(4) == 1 && getData(2) != getData (1)){
                setData(2, getData(2)+1);
                right(); 
            }else if (!isClearLeft()){
                if (getData(2) < getData(1)){
                    setData(9, 1); 
                }
                setData(3, 0); 
                setData(4, 1); 
                setData(2, 0);
                down(); 
                
            }else if (!isClearRight()){
                if (getData(2) < getData(1)){
                    setData(9, 1); 
                }
                setData(3, 1); 
                setData(4, 0); 
                setData(2, 0);
                down(); 
                
            }
        } 
    }
}
