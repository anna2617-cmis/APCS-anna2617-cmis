
public class MakeGroups
{
    public static String[] makeGroups(String[] names, int groupsize){
        String[] output = new String[names.length / groupsize]; 
        int random = 0; 
        int b = 0; 
        int[] out = new int[names.length / groupsize]; 
        while (b < names.length/groupsize){ //which group 
            System.out.print(random);
            for (int c = 0; c < groupsize; c ++){ // num of names in group
                for (int a = 0; a < names.length; a++){ // find each name
                    random = (int)(Math.random() * (names.length-1)); 
                    out[b] = random; 
                    System.out.println(random);
                    for (int i = 0; i < out.length; i++){
                        if (random == i){
                            random = (int)(Math.random() * (names.length-1)); 
                        }
                    }
                    System.out.print(random);
                    if (a == random){
                        System.out.print(random);
                        output[b]+=" "+names[a]; 
                    }
                }
            }
            b++;
        }

        return output; 
    }
}
