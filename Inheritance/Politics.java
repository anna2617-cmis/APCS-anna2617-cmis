public class Politics extends Idea
{
    private String country; 
    
    public Politics(){
        super(); 
    }
    
    public String getCountry(){
        return country;
    }

    public void setGods(String newCountry){
        this.country = newCountry;
    }
    
    public String toString(){
        String out = super.toString(); 
        out += "--> Politics";
        return out; 
    }
}
