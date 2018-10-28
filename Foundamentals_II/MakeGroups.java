public class MakeGroups
{
    public static String[] makeGroups(String[] names, int groupsize){        
        String[] output = new String[names.length / groupsize]; 
        String[] array = new String[names.length]; 
        for(int a = 0; a<names.length; a++){
            int random = (int)(Math.random() * (names.length));
            if (array[random] == null){
                array[random] = names[a]; 
            }else{
                while(array[random]!= null){
                    random = (int)(Math.random() * (names.length));
                }
                array[random] = names[a]; 
            }
        }
        int j = 0; 
        for(int b = 0; b < array.length; b++){ 
            if (j == output.length){
                j = 0; 
            }
            if(output[j] == null){
                output[j] = array[b]; 
            }else{
                output[j] += array[b]; 
            }
            j++;
        }
        return output; 
    }
}
