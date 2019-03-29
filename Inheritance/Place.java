public class Place extends Entity 
{
    private int population; 
    
    public Place(){
        super("default");
    }

    public Place(String name){
        super(name);
    } 
    
    public void setPopulation(int population){
        this.population = population; 
    }

    public int getPopulation(){
        return population; 
    }
    
    public String toString(){
        String out = super.toString(); 
        out += "--> Place"; 
        out += "\nPopulation" + population + "\n"; 
        return out; 
    } 
}
