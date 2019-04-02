public class PepsiMan extends SuperHero 
{
    private String name; 
    
    public PepsiMan(){
        super(); 
        name = "PepsiMan";
    }
    
    public String getName(){
        return name; 
    }
    
    public String motto(){
        String motto = "PepsiMannnnn!"; 
        return motto; 
    }
    
    public String toString(){
        String out = "PepsiMan";
        return out;
    }
}
