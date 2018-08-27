
import java.util.Scanner;
public class Checkerboard {
    public static void main (String[] args){
        Scanner Scan = new Scanner (System.in);
        int in_1 = Scan.nextInt(); 
        int in_2 = Scan.nextInt(); 
        System.out.println(checkerBoard(in_1, in_2));

    }

    public static String checkerBoard(int h, int w){
        int a = 0;
        int b = 0;
        int c = 0; 
        String mid = "";
        String bor = "+";
        String check = "#";
        String space = " ";
        String bor_1 = "-";
        String bor_2 = "|";
        String out_1 = ""; 
        String out_2 = ""; 
        String out_3 = "";
        while (a<=h+1){
            if (a == 0){
                for (int numa = 0 ; numa < w ; numa++){
                    mid += bor_1;  
                }
                out_1 = bor + mid + bor + "\n"; 
            }else if (a > 0 && a < h+1 ){
                for (c = 0 ; c < h+1; c++){
                    while (b<=h+1){
                        if (b == 0 || b == h+1){
                            out_2 += bor_2; 
                        }else if (b % 2 == 1){
                            out_2 += check;
                        }else if (b % 2 == 0){
                            out_2 += space;
                        }
                        b++;
                    }
                    out_2 += "\n";
                    
                }
                
            } else if (a == h+1){
                for (int numa = 0 ; numa < w ; numa++){
                    mid += bor_1;  
                }
                out_3 = bor + mid + bor; 
            }
            a++;
        }        
        String output = out_1 + out_2 + out_3;
        return output;
    }
}
