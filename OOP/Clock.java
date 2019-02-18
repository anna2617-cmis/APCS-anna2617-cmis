public class Clock
{
    private int hours; 
    private int minutes; 
    private int seconds; 

    public Clock(){
        this.hours = 0; 
        this.minutes = 0; 
        this.seconds = 0; 
    }

    public Clock(int a, int b, int c){
        this(); 
        this.hours = a; 
        this.minutes = b; 
        this.seconds = c; 
    }
    
    public String toString(){
        return String.format("This time is %d:%d:%d",hours, minutes, seconds);  
    }  
}
