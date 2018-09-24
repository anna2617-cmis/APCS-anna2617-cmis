import java.util.Scanner; 

public class Foundamentals_II
{
    public static void main (String[] args){
        int[] ar_1 = {0, 1, 2, 3, 4}; 
        double[] ar_2 = {2.3, 3.3, 12.2, 2.4, 5.3}; 
        String[] ar_3 = {"a", "s", "d", "f", "g"}; 
        System.out.format("The first integer is %d, the third double is %f, the fifth string is %s.", ar_1[0], ar_2[2], ar_3[4]); 

    }

    public static void printArray(int[] array, boolean skip){
        if(skip == false){
            for (int a = 0; a < array.length; a++){
                System.out.print(array[a]); 
            }
        }else if(skip == true){
            for (int a = 0; a < array.length; a++){
                if (a%2==1){
                    System.out.print(array[a]);
                }
            }
        }
    }
    
    
}