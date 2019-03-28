public class Idea extends Entity 
{
    private int followers; 
    
    public Idea(){
        super("default");
    }

    public Idea(String name){
        super(name);
    } 

    public String toString(){
        String out = super.toString(); 
        out += "--> Idea"; 
        return out; 
    } 
}
