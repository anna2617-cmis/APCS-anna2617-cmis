public class Place extends Entity 
{
    private String type; 
    
    public Place(){
        super("default");
    }

    public Place(String name){
        super(name);
    } 

    public String toString(){
        String out = super.toString(); 
        out += "--> Place"; 
        return out; 
    } 
}
