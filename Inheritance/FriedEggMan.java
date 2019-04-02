public class FriedEggMan extends SuperHero 
{
    private String name; 
    
    public FriedEggMan(){
        super(); 
        name = "FriedEggMan"; 
    }
    
    public String getName(){
        return name; 
    }
    
    public String motto(){
        String motto = "Fried Eggsssss!"; 
        return motto; 
    }
    
    public String toString(){
        String out = "FriedEggMan";
        return out;
    }
}
