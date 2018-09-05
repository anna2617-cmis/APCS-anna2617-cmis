import java.util.Scanner;
public class BinaryConverter
{
    public static void main(String args[]){
        Scanner Scan = new Scanner (System.in);
        System.out.println("BinaryConverter");
        int in_1 = Scan.nextInt(); 
        System.out.println(dec2bin(in_1));
        String in_2 = Scan.next(); 
        System.out.println(bin2dec(in_2));

    }

    public static int bin2dec(String bin){
        int output = 0; 
        if (bin.charAt(0) == '0'){
            for (int a = 0; a < 32; a++){

                if (bin.charAt(a) == '1'){
                    int b = 1; 
                    output += Math.pow(2, b);
                    b++; 
                } else if (bin.charAt(a) == '0'){
                    output += 0;
                }

            }

        }else if (bin.charAt(0) == '1'){
            int c = 0; 
            String new_bin = "";
            while (c < 32){
                
            }
        }

        return output;
    }

    public static String dec2bin(int dec){
        String output = "";
        if (dec < 0){
            dec = -dec;
            for (int a = 31; a >= 0; a--){
                if (dec - Math.pow(2, a) >= 0 ){
                    output += "0";
                    dec -= Math.pow(2, a);
                }else if  (dec - Math.pow(2, a) < 0 ){
                    output += "1";
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
                        output = output.substring(0,c)+"1"+output.substring(c+1);
                        e = false; 
                    }
                    c--;
                }
            } else if (dec % 2 == 1){
                output = output.substring(0,31)+"1"+output.substring(32);
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