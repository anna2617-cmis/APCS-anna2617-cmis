public class ReursivePractice 
{
    public static int mul(int a, int b){
        if (b == 1){
            return a; 
        }else if (b == 0 || a == 0){
            return 0; 
        }else{
            return a + mul(a, b-1); 
        }
    }

    public static int div(int a, int b){
        if (b == 1){
            return a; 
        }else if (a <= 0){
            return 0; 
        }else{
            return 1 + div(a - b, b) ; 
        }
    }
}