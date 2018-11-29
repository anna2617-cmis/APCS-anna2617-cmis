public class Repack
{

    public static void main(String[] args){
        int[][] array = getArray(5, 5, true);
        print(array);
        print(repack(array, 3));
    }

    public static int[][] repack(int[][] array, int w){
        int h = 0; 
        int count = 0; 
        if ((array.length * array[0].length ) / w == 0){
            h = (array.length * array[0].length ) / w; 
        } else{
            h = ((array.length * array[0].length ) / w ) + 1; 
        }
        int [] arr = new int [array.length * array[0].length]; 
        int[][] repacked = new int[h][w];

        for (int a = 0; a < array.length ; a ++){
            for (int b = 0; b < array[a].length ; b++){
                if (count < array.length * array[0].length){
                    arr[count] = array [a][b]; 
                    count ++; 
                }
            } 
        }
        count = 0; 
        for (int c = 0; c < h; c++){
            for (int d =0; d < w; d++){
                if (count < array.length * array[0].length){
                    repacked[c][d] = arr[count]; 
                    count ++; 
                }
            }
        }
        return repacked;
    }

    public static int[][] getArray(int h, int w, boolean random){
        int[][] array = new int[h][w];
        int ct = 0;
        for(int y = 0; y < h; y++){
            for(int x = 0; x < w; x++){
                if(random){
                    int v = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
                    array[y][x] = v == 0 ? 1 : v;
                }else{
                    array[y][x] = ct++;
                }
            }
        }
        return array;
    }

    public static void print(int[][] array){
        String out = "{";
        for(int y = 0; y < array.length; y++){
            out += "{";
            for(int x = 0; x < array[y].length; x++){
                out += array[y][x];
                if(x != array[y].length -1)
                    out += ", ";
            }
            out += "}";
            if( y != array.length -1)
                out+=",\n";
        }
        out+= "}\n";
        System.out.println(out);
    }
}