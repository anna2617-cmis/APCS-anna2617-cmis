public class MergeSort
{
    public static void main(String[] args){
        int[] numbers = new int[4];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int[] front = new int[array.length / 2]; 
        int[] back = new int[array.length / 2]; 
        if (array.length != 1){
            for (int a = 0; a < array.length / 2; a++){
                front[a] = array[a];
            }
            for (int b = array.length / 2; b < array.length; b++){
                back[b - array.length / 2] = array[b]; 
            }
        }

    }
}