public class ReursivePractice 
{
    public static int mul(int a, int b){
        if (a < 0 && b < 0){
            if (b == -1){
                return -a;  
            }else{
                return -a + mul(a, b + 1); 
            } 
        }else if ( b < 0 ){
            if (a == 1){
                return b; 
            }else{
                return b + mul(a - 1, b); 
            } 
        } else{
            if (b == 1){
                return a; 
            }else{
                return a + mul(a, b-1); 
            } 
        }
    }

        public static int div(int a, int b){
        if (Math.abs(a) < Math.abs(b)){
            return 0; 
        }else if (b == 1){
            return a; 
        }else if ((a < 0 && b < 0)||(a > 0 && b > 0)){
            return 1 + div(a - b, b) ; 
        }else if (a < 0){
            return -1 - div(Math.abs(a) - b, b); 
        }else {
            return -1 + div(a + b, b); 
        }
    }

    public static int pow(int a, int b){
        if(b == 1){
            return a; 
        }else if (b == 0){
            return 1; 
        }else{
            return mul(a, pow( a, b - 1)); 
        }
    }
}