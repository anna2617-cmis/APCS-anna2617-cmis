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
            output[a] = (int) (Math.random() * (max-min)) +min; 
        }
        return output; 
    }

    public static double[] randomDoubles(int n, double min, double max){
        double[] output = new double[n];
        for (int a = 0; a < n; a++){
            output[a] = (Math.random() * (max-min)) +min; 
        }
        return output; 
    }

    public static int[] copy(int[] array){
        int[] output = new int[array.length -1];
        for (int a = 0; a < array.length-1; a ++){
            output[a] = array[a]; 
        }
        return output; 
    }

    public static double[] copy(double[] array){
        double[] output = new double[array.length -1];
        for (int a = 0; a < array.length-1; a ++){
            output[a] = array[a]; 
        }
        return output; 
    }

    public static String[] copy(String[] array){
        String[] output = new String[array.length -1];
        for (int a = 0; a < array.length-1; a ++){
            output[a] = array[a]; 
        }
        return output; 
    }

    public static boolean[] copy(boolean[] array){
        boolean[] output = new boolean[array.length];
        for (int a = 0; a < array.length; a ++){
            output[a] = array[a]; 
        }
        return output; 
    }

    public static int[] pairs(int n){
        int[] output = new int[n * 2];
        int b = 1; 
        for (int a = 0 ; a < n*2-1; a+=2){
            output[a] = b*2; 
            output[a+1] = b*2; 
            b++; 
        }
        return output; 
    }
    
    public static int[] concat(int[] a, int[] b){
        int[] output = new int[a.length + b.length];
        int c = 0; 
        for (int i = 0; i < a.length; i++){
            output[i] = a [i];
        } 
        for (int x = a.length; x < a.length + b.length; x++){
            output[x] = b [c];
            c++; 
        }
        return output; 
    }
    
    public static int[] merge(int[] a, int[] b){
        int[] output = new int[a.length + b.length];
        int same = 0;
        int bigger = 0; 
        int [] bigger_array = new int [0]; 
        int k = 0; 
        if (a.length >= b.length){
            same = b.length; 
            bigger = a.length; 
            bigger_array = a;
        }else {
            same = a.length; 
            bigger = b.length; 
            bigger_array = b; 
        }
        for (int i = 0; i < same; i++){
            output[2*i] = a[i]; 
            output[2*i+1] = b[i]; 
        }
        for (int j = same*2-1; j< a.length + b.length; j++){
            output[j] = bigger_array[same-1]; 
            same ++; 
        }
        return output; 
    }
}