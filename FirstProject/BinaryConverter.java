import java.util.Scanner;
public class BinaryConverter
{
    public static void main(String args[]){
        Scanner Scan = new Scanner (System.in);
        System.out.println("BinaryConverter");
        int in_2 = Scan.nextInt(); 
        System.out.println(dec2bin(in_2));

    }
    
    public static int bin2dec(String bin){
        /*
         * Takes a String that looks like a 32-bit binary number and returns
         * the equivalent int value
         */
        
        return 0;
    }
    
    public static String dec2bin(int dec){
        int pow = 0;
        String output = "";
        for (int a = 31; a >= 0; a--){
            if (dec - Math.pow(2, a) >= 0 ){
                output += 1;
                dec -= Math.pow(2, a);
            }else if  (dec - Math.pow(2, a) < 0 ){
                output += 0;
            }
        }
        /*
         * Takes an int as an argument and returns a String representation
         * of the 32 bit binary.
         */
        return output;
    }
}