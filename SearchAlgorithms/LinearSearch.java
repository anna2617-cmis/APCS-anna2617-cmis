public class LinearSearch
{
    public static void main(String args[]){
        int[] array = {1,2,3,4,5}; 
        System.out.print(linear(2,array));
    }

    public static int linear(int threshold, int[] array){
        for (int a = 0; a < array.length; a++){
            if (array[a] == threshold){
                return a; 
            }
        }
        return -1; 
    }
}
