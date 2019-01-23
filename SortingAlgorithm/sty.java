
public class sty
{

    public static int[] sort(int[] front, int [] back ){
        // front 2 {0,1}
        // back 1 {0}

        int a = 0; 
        int b = 0; 
        int[] arr = new int [front.length + back.length]; 
        for(int c = 0; c < arr.length; c++ ){
            if (a < front.length && b < back.length){ // second time loop front[a] don't exist anymore 
                if (front[a] < back[b] ){
                    arr[c] = front[a]; 
                    a ++; 
                }else{
                    arr[c] = back[b]; 
                    b ++; 
                }
            }
            else if (a == front. length || b == back.length){
                if (a > b){
                    arr[c] = back[b];
                    b++; 
                }else{
                    arr[c] = front[a]; 
                    a++; 
                }
            }
        }
        return arr; 

    }
}
