import java.util.Scanner; 
public class ClockApplication
{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Clock kitchenClock = new Clock(); 
        System.out.println(kitchenClock.toString());
        int hr = scan.nextInt();
        int min = scan.nextInt();
        int sec = scan.nextInt();
        Clock bedroomClock = new Clock(hr,min,sec); 
        System.out.println(bedroomClock.toString());
    }
}
