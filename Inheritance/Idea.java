public class Idea extends Entity 
{
    private int followers; 
    
    public Idea(){
        super("default");
    }

    public Idea(String name){
        super(name);
    } 
    
    public void setFollowers(int followers){
        this.followers = followers; 
    }

    public int getFollowers(){
        return followers; 
    }
    
    public String toString(){
        String out = super.toString(); 
        out += "--> Idea";
        out += "\nFollowers" + followers + "\n"; 
        return out; 
    } 
}
