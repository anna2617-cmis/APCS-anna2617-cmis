public class Anime
{
    private String title; 
    private int epNum; 
    private double rating; 
    
    public Anime(){
        this.title = "UMR"; 
        this.epNum = 12; 
        this.rating = 8.6; 
    }
    
    public Anime(String a, double b){
        this(); 
        this.title = a; 
        this.rating = b; 
    }
    
    public String toString(){
        return String.format("%ntitle:  %s%nnumber of ep:  %d%nrating:  %f",title, epNum, rating);  
    }  
}
