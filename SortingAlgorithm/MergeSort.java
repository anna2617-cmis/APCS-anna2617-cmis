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

    public static int[] sort(int[] array){
        if (array.length == 1){
            return array; 
        }else {
            int[] front = new int[array.length / 2]; 
            int[] back = new int[array.length / 2]; 
            for (int a = 0; a < array.length / 2; a++){
                front[a] = array[a];
            }
            for (int b = array.length / 2; b < array.length; b++){
                back[b - array.length / 2] = array[b]; 
            }
            front = sort(front); 
            back = sort(back); 
            int a = 0; 
            int b = 0; 
            int c = 0; 
            int[] arr = new int [front.length + back.length]; 
            while ( a + b < front.length + back.length -1){
                if (front[a] < front[b] && a < front.length){
                    arr[c] = front[a]; 
                    a ++; 
                }else{
                    arr[c] = front[b]; 
                    b ++; 
                }
                c ++; 
            }
            return arr; 
        }
    }
}