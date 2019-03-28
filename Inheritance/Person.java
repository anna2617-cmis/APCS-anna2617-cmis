public class Person extends Entity
{
    private double age; 

    public Person(){
        super("default");
    }

    public Person(String name){
        super(name);
    } 

    public String toString(){
        String out = super.toString(); 
        out += "--> Person"; 
        return out; 
    } 
}
