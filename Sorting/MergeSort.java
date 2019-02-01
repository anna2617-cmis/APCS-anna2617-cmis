public class MergeSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }
    
    public static int[] sort(int[] array){
        //BASE CASE
        steps ++; 
        if(array.length <= 1){
            steps ++; 
            return array;
        }
        
        //SPLIT STEP
        int half = array.length / 2;
        int[] front = new int[half];
        int[] back = new int[array.length - half];
        steps += 4; 
        for(int i = 0; i < array.length; i++){
            steps += 3; 
            if(i < half){
                steps += 2; 
                front[i] = array[i];
            }else{
                steps += 2; 
                back[i - half] = array[i];
            }
        }

        //MERGESORT STEP
        front  = sort(front);
        steps ++; 
        back = sort(back);
        steps ++; 
        //MERGE STEP
        int fi = 0;
        int bi = 0;
        steps += 3; 
        for(int i = 0; i < array.length; i++){
            steps += 6; 
            if((bi >= back.length) || (fi < front.length  &&  front[fi] < back[bi])){
                steps += 3; 
                array[i] = front[fi];
                fi++;
            }else{
                steps += 3;
                array[i] = back[bi];
                bi++;
            }
        }
        steps += 1;
        return array;
    }

}
