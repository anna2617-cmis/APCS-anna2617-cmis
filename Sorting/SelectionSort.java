public class SelectionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        int smallestIdx = 0;
        int temp;
        steps += 3;
        for(int s = 0; s < array.length; s++){
            smallestIdx = s;
            steps += 10;
            for(int n = s; n < array.length; n++){
                steps += 4;
                if(array[n] < array[smallestIdx]){
                    steps ++;
                    smallestIdx = n;
                }
            }
            temp = array[smallestIdx];
            array[smallestIdx] = array[s];
            array[s] = temp;
        }
        steps ++;
        return array;
    }
}