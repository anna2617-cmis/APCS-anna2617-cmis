public class Song
{
    private int likes = 432001201; 
    private double length = 1.32; 
    private boolean preference = true; 
    private String title = "aLiez"; 

    public Song(){
        this.likes = 420; 
        this.length = 8.5; 
        this.preference = true; 
        this.title = "V"; 
    }

    public Song(int a, double b, boolean c){
        this(); 
        this.preference = c; 
        this.likes = a; 
        this.length = b; 
    }

    public String toString(){
        return String.format("%nlikes:  %d%nlength:  %f%npreference:  %s%ntitle:  %s",likes, length, preference, title);  
    }  
}
