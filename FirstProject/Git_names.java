public class Git_names
{
    public static void main(String args[]){
        String new_out = "";
        String output = "1011111";

        for (int b = output.length(); output.charAt(b-1)=='1'; b--){
            output = output.substring(0,b-1)+"0"+output.substring(b);
        }      
        boolean e = true;
        int c = output.length();
        while ( e == true){ 
            int d = output.charAt(c-1); 

            if (d=='1'){
                output = output.substring(0,c)+"1"+output.substring(c+1);
                e = false; 
            }
            c--; 
            
        }
        System.out.println(output); 
    }
}
