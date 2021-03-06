
import java.util.Scanner;
public class Checkerboard {
    public static void main (String[] args){
        Scanner Scan = new Scanner (System.in);
        int in_1 = Scan.nextInt(); 
        int in_2 = Scan.nextInt(); 
        System.out.println(checkerBoard(in_1, in_2));

    }

    public static String checkerBoard(int h, int w){
        String output = "";
        String mid = "";
        int num = (int)(Math.random() * 10); 
        int roll = (int)(Math.random() * ((h - 1) + 1)) + 1;
        int column = (int)(Math.random() * ((w - 1) + 1)) + 1;
        for (int a = 0; a <= h + 1; a++){
            if (a == 0 || a == h + 1){
                mid = "";
                for (int c = 1; c <= w; c ++){
                    mid += "-";
                }
                output += "+" + mid + "+";
            }else if (a > 0 && a <= h){
                for (int b = 0; b <= w + 1; b++){
                    if (b == 0 || b == w + 1){
                        output += "|"; 
                    }
                    else if ( (b + a) % 2 == 0) {
                        while ((roll + column) % 2 != 0){
                            roll = (int)(Math.random() * ((h - 1) + 1)) + 1;
                            column = (int)(Math.random() * ((w - 1) + 1)) + 1;
                        }
                        if (a == roll && b == column ){
                            output += num; 
                        }else{
                            output += "#";
                        }
                    }else if ( (b + a) % 2 == 1){
                        output += " "; 
                    }
                }
            }
            output += "\n";
        }
        return output;
    }
}
