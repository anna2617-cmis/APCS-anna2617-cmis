public class Thing extends Entity
{
    private int value; 
    
    public Thing(){
        super("default");
    }

    public Thing(String name){
        super(name);
    }
    
    public void setValue(int value){
        this.value = value; 
    }

    public int getValue(){
        return value; 
    }

    public String toString(){
        String out = super.toString(); 
        out += "--> Thing"; 
        out += "\nValue" + value + "\n"; 
        return out; 
    } 
}
