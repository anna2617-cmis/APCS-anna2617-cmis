public class Foundamentals_III
{
    public static void main(String[] args){
        int[][] array_1 = new int[5][5];

        int[][] array_2 ={{1,2,3,4,5},{3,2,4,1,3},
                {2,5,3,1,5},{2,3,5,3,2},{3,4,2,3,4}};

        double[][] array_3 = new double[5][5];

        double[][] array_4 ={{1,2,3,4,5},{3,2,4,1,3},
                {2,5,3,1,5},{2,3,5,3,2},{3,4,2,3,4}}; 

        String[][] array_5 ={{" ","#"," ","#"," ","#"," ","#"}, 
                {"#"," ","#"," ","#"," ","#"," "}, {" ","#"," ","#"," ","#"," ","#"},
                {"#"," ","#"," ","#"," ","#"," "}, {" ","#"," ","#"," ","#"," ","#"},
                {"#"," ","#"," ","#"," ","#"," "}, {" ","#"," ","#"," ","#"," ","#"},
                {"#"," ","#"," ","#"," ","#"," "}};

    }

    public static int location(int[][] array, int x, int y){
        int i = array[x][y]; 
        return i; 
    }

    public static double location(double[][] array, int x, int y){
        double i = array[x][y]; 
        return i; 
    }

    public static String location(String[][] array, int x, int y){
        String i = array[x][y]; 
        return i; 
    }

    public static int[][] setValue(int[][] arr, int r, int c, int v){
        arr[r][c] = v; 
        return arr; 
    }

    public static double[][] setValue(double[][] arr, int r, int c, double v){
        arr[r][c] = v; 
        return arr; 
    }

    public static String[][] setValue(String[][] arr, int r, int c, String v){
        arr[r][c] = v; 
        return arr; 
    }

    public static void print2DArray(int[][] array, boolean rowMajor){
        if (rowMajor){
            int a = 0; 
            for (int y = 0; y < array.length; y++){
                for (int x = 0; x < array[0].length; x++){
                    a = array[y][x];
                    System.out.print(a + " "); 
                }
                System.out.println(); 
            }
        }else{
            int a = 0; 
            for (int y = 0; y < array.length; y++){
                for (int x = 0; x < array[0].length; x++){
                    a = array[x][y];
                    System.out.print(a + " "); 
                }
                System.out.println(); 
            }
        }
    }

    public static void snakePrint(int[][] arr){
        int a = 0; 
        for (int y = 0; y < arr.length; y++){
            if (y % 2 == 0){
                for (int x = 0; x < arr[0].length; x++){
                    a = arr[y][x];
                    System.out.print(a + " "); 
                }
            }else{
                for (int x =  arr[0].length-1; x >= 0; x--){
                    a = arr[y][x];
                    System.out.print(a + " "); 
                }
            }
        }
    }

    public static String[][] locate(String[][] arr){
        int y = (int) (Math.random() * (arr.length / arr[0].length)); 
        int x = (int) (Math.random() * (arr[0].length));
        int num = (int) (Math.random() * (10));   
        String s_num = "" + num;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (i==y && j ==x){
                    arr[i][j] = s_num; 
                }
            }
        }
        return arr; 
    }
    
    public static int[][] replace(int[][] array, int threshold, int newValue){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] > threshold){
                    array [i][j] = newValue; 
                }
            }
        }
        return array; 
    }
    
    public static double[][] shift(double[][] arr, int row){
        double [][] output = new double [arr.length][arr[0].length]; 
        for (int a = 0; a < arr.length; a++){
            if (a < row){
                output[a] = arr[a]; 
            }else if(a >= row && a != arr.length -1){
                output[a+1] = arr[a]; 
            }
        }
        for (int b = 0; b < arr[0].length; b++){
            output[row][b] = Math.random() * 10; 
        }
        return output; 
    }
    
    public static double[][] tilt(double[][] arr){
        double[][] output = new double [arr[0].length][arr.length]; 
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[0].length; b++){
                output[b][a] = arr[a][b]; 
            }
        }
        return output; 
    }
    
    public static int[] greatestrc(int[] arr){
        int [] output = new int [0]; 
        return output; 
    }
} 
