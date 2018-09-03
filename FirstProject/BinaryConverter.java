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
        if (dec < 0){
            dec = -dec;
            for (int a = 31; a >= 0; a--){
                if (dec - Math.pow(2, a) >= 0 ){
                    output += 0;
                    dec -= Math.pow(2, a);
                }else if  (dec - Math.pow(2, a) < 0 ){
                    output += 1;
                }
            }
            if (dec % 2 == 0){
                for (int b = output.length(); output.charAt(b-1)=='1'; b--){
                    output = output.substring(0,b-1)+"0"+output.substring(b);
                }      
                boolean e = true;
                int c = output.length();
                while ( e == true){ 
                    int d = output.charAt(c-1); 
                     
                    if (d =='1'){
                        output = output.substring(0,c+1)+"1"+output.substring(c);
                        e = false; 
                    }
                    c--;
                }
            } else if (dec % 2 == 1){
                output = output.substring(0,31)+"1"+output.substring(31);
            }
        }else {
            for (int a = 31; a >= 0; a--){
                if (dec - Math.pow(2, a) >= 0 ){
                    output += 1;
                    dec -= Math.pow(2, a);
                }else if  (dec - Math.pow(2, a) < 0 ){
                    output += 0;
                }
            }              
        }
        return output;
    }
}