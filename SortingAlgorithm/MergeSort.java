public class MergeSort
{
    public static void main(String[] args){
        int[] numbers = new int[10];
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
            int[] front; 
            int[] back; 
            if (array.length % 2 == 0){
                front = new int[array.length / 2]; 
                back = new int[array.length / 2]; 
                for (int a = 0; a < array.length / 2; a++){
                    front[a] = array[a];
                }
                for (int b = array.length / 2; b < array.length; b++){
                    back[b - array.length / 2] = array[b]; 
                }
            }
            else{
                front = new int[array.length / 2 + 1]; 
                back = new int[array.length / 2]; 
                for (int a = 0; a < array.length / 2 + 1; a++){
                    front[a] = array[a];
                }
                for (int b = array.length / 2 + 1; b < array.length; b++){
                    back[b - (array.length / 2 + 1)] = array[b]; 
                }
            }
            front = sort(front); 
            back = sort(back); 
            // 
            int a = 0; 
            int b = 0; 

            for(int c = 0; c < array.length; c++ ){
                if (a < front.length && b < back.length){ // second time loop front[a] don't exist anymore 
                    if (front[a] < back[b] ){
                        array[c] = front[a]; 
                        a ++; 
                    }else{
                        array[c] = back[b]; 
                        b ++; 
                    }
                }
                else if (a == front. length || b == back.length){
                    if (a > b){
                        array[c] = back[b];
                        b++; 
                    }else{
                        array[c] = front[a]; 
                        a++; 
                    }
                }
            }
            return array; 
        }
    }
}