
public class MakeGroups
{
    public static String[] makeGroups(String[] names, int groupsize){
        String[] output = new String[names.length / groupsize]; 
        int random = 0; 
        int b = 0; 
        int[] out = new int[names.length]; 

        while (b < names.length/groupsize){ //which group 

            for (int c = 0; c < groupsize; c ++){ // num of group 
                int d = 0; 
                random = (int)(Math.random() * (names.length)); 
                out[d] = random; 
                for (int i = 0; i < out.length; i++){
                    if (random == out[i]){
                        random = (int)(Math.random() * (names.length));

                        out[d] = random; 
                    }
                }
                for (int a = 0; a < names.length; a++){ // find each na
                    System.out.println(random);
                    if (a == random){
                        if(output[0] == null){
                            output[b] += " "+ names[a]; 
                        }
                        else{
                            output[b]+=" "+names[a]; 
                        }
                    }
                    d++;
                }
            }
            b++;
        }

        return output; 
    }
}
