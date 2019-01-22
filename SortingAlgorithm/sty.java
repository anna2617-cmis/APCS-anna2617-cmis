
public class sty
{

    public static int[] sort(int[] front, int [] back ){
        // front 2 {0,1}
        // back 1 {0}

        int a = 0; 
        int b = 0; 
        int c = 0; 
        int[] arr = new int [front.length + back.length]; 
        while ( a + b <= front.length + back.length){
            if (front[a] < back[b] && a < front.length){ // second time loop front[a] don't exist anymore 
                
                arr[c] = front[a]; 
                a ++; 
            }else if (b < back.length){
                arr[c] = back[b]; 
                b ++; 
            }
            c ++; 
        }
        return arr; 

    }
}
