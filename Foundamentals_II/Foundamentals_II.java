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
                System.out.print(array[a] + " "); 
            }
        }else 
            for (int a = 0; a < array.length; a++){

                System.out.print(array[a] + " ");

            }

    }

    public static void printArray(double[] array, boolean skip){
        if(skip == false){
            for (int a = 0; a < array.length; a++){
                System.out.print(array[a] + " "); 
            }
        }else 
            for (int a = 0; a < array.length; a++){

                System.out.print(array[a] + " ");

            }

    }

    public static void printArray(String[] array, boolean skip){
        if(skip == false){
            for (int a = 0; a < array.length; a++){
                System.out.print(array[a] + " "); 
            }
        }else
            for (int a = 0; a < array.length; a+=2){

                System.out.print(array[a] + " ");

            }

    }

    public static void printArray(boolean[] array, boolean skip){
        if(skip == false){
            for (int a = 0; a < array.length; a++){
                System.out.print(array[a] + " "); 
            }
        }else
            for (int a = 0; a < array.length; a+=2){

                System.out.print(array[a] + " ");

            }

    }

    public static int lastItem(int[] array){
        int output = array[array.length - 1]; 
        return output; 
    }

    public static double lastItem(double[] array){
        double output = array[array.length - 1]; 
        return output; 
    }

    public static String lastItem(String[] array){
        String output = array[array.length - 1]; 
        return output; 
    }

    public static boolean lastItem(boolean[] array){
        boolean output = array[array.length - 1]; 
        return output; 
    }

    public static int middleItem(int[] array){
        int mid = (array.length -1) / 2 ;
        int output = array[mid];
        return output; 
    }

    public static double middleItem(double[] array){
        int mid = (array.length -1) / 2 ;
        double output = array[mid];
        return output; 
    }

    public static String middleItem(String[] array){
        int mid = (array.length -1) / 2 ;
        String output = array[mid];
        return output; 
    }

    public static boolean middleItem(boolean[] array){
        int mid = (array.length -1) / 2 ;
        boolean output = array[mid];
        return output; 
    }

    public static int[] randomInts(int n, int min, int max){
        int[] output = new int[n];
        for (int a = 0; a < n; a++){
            output[a] = (int) (Math.random * max) -min; 
        }
        
        return output; 
    }

}