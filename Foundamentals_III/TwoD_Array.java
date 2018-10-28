
public class TwoD_Array
{
    public static void main(String[] args){
        defaultArray(5,5);
    }

    public static int[][] defaultArray (int h, int w){
        int[][] array = new int[h][w];
        int z = 0;
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                z++; 
                System.out.print(z + " "); 
            }
            System.out.println(); 
        }
        return array;
    }

}
