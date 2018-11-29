public class FoundamentalsIIQuiz
{
    public static int[] minmax(int[] array){
        int max = 0; 
        int min = 0; 
        int[] output = new int [2]; 
        for (int a = 0; a < array.length; a++){
            if (array[a] > max){
                max = array[a];
            }
            if (array[a] < min){
                min = array[a]; 
            }
        }
        output[0] = min; 
        output[1] = max; 
        return output; 
    }

    public static int[] filter(int[] array, int min, int max, boolean positive){
        int[] output = new int[0]; 
        if (positive){
            int count = 0; 
            for (int a = 0; a < array.length; a++){
                if (array[a] <= max && array[a] >= min){
                    count ++; 
                } 
            }
            output = new int [count]; 
            int d = 0; 
            for (int a = 0; a < array.length; a++){    
                if (array[a] <= max && array[a] >= min){
                    output[d] = array[a];  
                    d++; 
                } 
            }
        }else{
            int count = 0; 
            for (int a = 0; a < array.length; a++){
                if (array[a] > max || array[a] < min){
                    count ++; 
                } 
            }
            output = new int [count]; 
            int e = 0; 
            for (int a = 0; a < array.length; a++){    
                if (array[a] > max || array[a] < min){
                    output[e] = array[a];  
                    e++; 
                } 
            }
        }
        return output;
    }
}
