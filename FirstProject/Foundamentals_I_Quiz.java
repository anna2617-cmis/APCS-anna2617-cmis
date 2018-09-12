import java.util.Scanner;
public class Foundamentals_I_Quiz
{
    public static void main(String args[]){
        Scanner Scan = new Scanner (System.in);
        int in_1 = Scan.nextInt();
        int in_2 = Scan.nextInt();
        int in_3 = Scan.nextInt();
        System.out.println(method1(in_1, in_2, in_3));
        int in_4 = Scan.nextInt();
        int in_5 = Scan.nextInt();
        System.out.println(method2(in_4,in_5));
        int in_6 = Scan.nextInt();
        int in_7 = Scan.nextInt();
        System.out.println(method3(in_6,in_7));
    }

    public static int method1(int a, int b, int c){
        int poduct = 0; 
        int max1 = 0; 
        int max2 = 0; 
        if (a >= b && a >= c){
            max1 = a; 
            if (b >= c){
                max2 = b; 
            }else{
                max2 = c; 
            }
        }else if (b >= a && b >= c){
            max1 = b; 
            if (a >= c){
                max2 = a; 
            }else{
                max2 = c; 
            }
        }else if (c >= a && c >= b){
            max1 = c; 
            if (b >= a){
                max2 = b; 
            }else{
                max2 = a; 
            }
        }
        poduct = max1 * max2; 
        return poduct; 
    }

    public static int method2(int a, int b){
        int output = 0; 
        if (a > 0) {
            for (int i = 0; i <= a; i++){
                output += i * b;
            }        
        }else {
            output = 0; 
        }
        return output; 
    }

    public static String method3(int h, int w){
        String output = ""; 
        String lin = ""; 
        if (h % 2 == 1 && w % 2 == 1){
            for (int a = 0; a < h; a++){
                if (a == (int)h/2){
                    for (int c = 0; c <= (int)h/2; c++){
                        lin += "-";
                    }
                    output += lin + "+" + lin; 
                }else{
                    for (int b = 0; b < w; b++){
                        if (b == (int)w/2){
                            output += "|";
                        }
                        output += " ";  
                    }                
                }
                output += "\n";
            }
        }else {
            output += "+"; 
        }
        return output; 
    }
}

