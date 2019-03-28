public class Entity
{
    private String name; 
    
    public Entity (String name){
        this.name = name; 
    }
    
    public void changeName(String newName){
        this.name = newName; 
    }
    
    public String getName(){
        return name; 
    }
    
    public String toString(){
        return String.format("%s %s %s",  super.toString(), name, "Enity"); 
    }
}
