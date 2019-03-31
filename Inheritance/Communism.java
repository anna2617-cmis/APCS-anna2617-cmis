public class Communism extends Idea
{
    private String leader; 
    private String country; 
    
    public Communism(){
        this.leader = leader; 
        this.country = country; 
    }
    
    public String toString(){
        String out = super.toString(); 
        out += "--> Communism";
        out += "\nLeader:" + leader + "\nCountry:" + country;
        return out; 
    }
}
