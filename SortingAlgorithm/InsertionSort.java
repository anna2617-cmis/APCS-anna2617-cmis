public class InsertionSort
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
        for (int a = 1; a < array.length; a++){ 
            int preCount = 1; 
            int switchCount = 0; 
            while (array[a-switchCount] < array[a-preCount]){
                int temp = array[a-switchCount]; 
                array[a-switchCount] = array[a-preCount];
                array[a-preCount]=temp; 
                if (a-preCount > 0){
                    preCount++; 
                    switchCount++; 
                }
            }
        }
    }
}