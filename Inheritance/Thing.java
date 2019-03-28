public class Thing extends Entity
{
    private boolean consumable; 
    
    public Thing(){
        super("default");
    }

    public Thing(String name){
        super(name);
    }

    public String toString(){
        String out = super.toString(); 
        out += "--> Thing"; 
        return out; 
    } 
}
