import java.util.*;
public class TelevisionDriver
{
    public static void main(String[] args){
        List<Television> televisions = new ArrayList<Television>();

        Plasma plasma = new Plasma("Bronze", 59.99); 
        DLP dlp = new DLP("Silver", 99.99); 
        LCD lcd = new LCD("Gold", 199.99);
        LED led = new LED("Platinum", 399.99); 

        televisions.add(plasma);
        televisions.add(dlp);
        televisions.add(lcd);
        televisions.add(led);

        for (Television television : televisions){
            System.out.println(television); 
        }
    }
}
