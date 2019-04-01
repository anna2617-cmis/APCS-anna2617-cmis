public class Religion extends Idea 
{
    private String gods; 
    private String holidays; 

    public Religion(){
        super(); 
    }

    public String getGods(){
        return gods;
    }

    public void setGods(String newGods){
        this.gods = newGods;
    }
    
    public String toString(){
        String out = super.toString();
        out += "->Religion";
        return out;
    }
}
