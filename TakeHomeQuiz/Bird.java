public class Bird extends Animal
{
    private int x; 
    private int y; 
    private String color; 

    public Bird(int x, int y, String color){
        super(x,y); 
        this.color = color; 
        super.setGraphic("   \\"+"\n"+"   (o>"+"\n"+"\\\\_//)"+"\n"+" \\_/_)"+"\n"+"  _|_ "); 
    }

    public boolean eat(String food){
        if (food == "worms" || food == "seeds"){
            return true; 
        }else{
            return false; 
        }
    }

    public String getColor(){
        return color; 
    }

    public int getX(){
        x = getLocation().get(0); 
        return x; 
    }

    public int getY(){
        y = getLocation().get(1); 
        return y; 
    }

    public void fly(int x, int y){
        while(getX() != x){
            if(getX() < x){
                super.move(1,0); 
            }else{
                super.move(-1,0); 
            }
        }
        while(getY() != y){
            if(getY() < y){
                super.move(0,1); 
            }else{
                super.move(0,-1); 
            }
        }
    }

    public String toString(){
        String out = "Bird\n"; 
        out += super.getGraphic(); 
        out += "\nx:" + getX() + "\ny:" + getY() + "\n"; 
        out += super.toString(); 
        return out; 
    }
}
