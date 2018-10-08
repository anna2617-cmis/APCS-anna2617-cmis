public class NewMakeGroups
{
    public static void makeGroups(String[] names, int groupsize){
        String[] output = new String[names.length / groupsize]; 
        int random = (int)(Math.random() * (names.length));
        System.out.print(random); 
        for (int a = 0; a < names.length; a++){
            if (a == random){
                output[0] = names[a]; 
            }

        }

    }
}
