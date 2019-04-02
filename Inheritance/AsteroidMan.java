public class AsteroidMan extends SuperHero 
{
    private String name; 
    
    public AsteroidMan(){
        super(); 
        name = "AsteroidMan";
    }

    public String getName(){
        return name; 
    }
    
    public String motto(){
        String motto = "Asteroido!"; 
        return motto; 
    }
    
    public String toString(){
        String out = "AsteroidMan";
        return out;
    }
}
