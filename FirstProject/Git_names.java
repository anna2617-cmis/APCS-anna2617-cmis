public class Git_names
{
    public static void main(String args[]){
        String new_out = "";
        String output = "011111";
        
        for (int b = output.length(); output.charAt(b-1)=='1'; b--){
            output = output.substring(0,b-2)+"0"+output.substring(b);
        }      
        
        System.out.println(output); 
    }
}
