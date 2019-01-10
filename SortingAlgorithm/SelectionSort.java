public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
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
        for(int a = 0; a < array.length; a++){
            int min = array[a]; 
            int minIndex = a; 
            int temp = 0; 
            for(int b = a; b < array.length; b++){
                if (array[b] < min){
                    min = array[b]; 
                    minIndex = b; 
                }
            }
            temp = array[a]; 
            array[a] = array[minIndex]; 
            array[minIndex] = temp; 
        }
    }
}