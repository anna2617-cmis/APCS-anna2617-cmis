public class Fundamentals_III
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

    public static void greatestrc(int[][] arr){
        int c_max = 0; 
        int c_num = 0; 
        int r_max = 0; 
        int r_num = 0; 
        String result = ""; 
        for(int a = 0; a < arr.length; a++){
            int c_sum = 0; 
            for (int b = 0; b < arr[0].length; b++){
                c_sum += arr[a][b]; 
                if (c_sum > c_max){
                    c_max = c_sum; 
                    c_num = a; 
                }
            }
        }
        int[][] array = new int [arr[0].length][arr.length]; 
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[0].length; b++){
                array[b][a] = arr[a][b]; 
            }
        }
        for(int a = 0; a < array.length; a++){
            int r_sum = 0; 
            for (int b = 0; b < array[0].length; b++){
                r_sum += arr[b][a]; 
                if (r_sum > r_max){
                    r_max = r_sum; 
                    r_num = a; 
                }
            }
        }
        if( r_max > c_max){
            result += "row " + r_num; 
        }else {
            result += "colum " + c_num;
        }
        System.out.print(result);
    }

    public static int subarray(int[][] arr, int h, int w){

        int max = 0; 
        for (int d = 0; d < arr.length && d + h <= arr.length; d++){
            for (int c = 0; c < arr[0].length && c + w <= arr[0].length; c++){
                int count = 0; 
                for (int a = d; a < h+d; a++){
                    for (int b = c; b < w+c; b++){
                        count += arr[a][b]; 
                        if (count > max){
                            max = count; 

                        }
                    }
                }
            }
        }
        return max; 
    }

    public static void ring(int[][] arr){
        int ringNumber = 0; 
        for (int h = 0; h < arr.length; h ++){
            for (int w = 0; w < arr[0].length; w ++){
                if (h == w){
                    ringNumber ++; 
                }
            }
        }
        if (ringNumber % 2 == 0){
            ringNumber = ringNumber/2; 
        }else{
            ringNumber = (ringNumber/2) + 1;  
        }
        int[] ringSum = new int [ringNumber]; 
        for (int a = 0; a < ringNumber; a ++){
            for (int col = a; col <= arr.length - (1 + a); col ++){
                for (int row = a; row <= arr[0].length - (1 + a); row ++){
                    if (col == a || col == arr.length - (1 + a)){
                        ringSum[a] += arr[col][row]; 
                    }else if (col > a && row == a){
                        ringSum[a] += arr [col][a]; 
                    }else if (col > a && row == arr[0].length - (1 + a)){
                        ringSum[a] += arr [col][row]; 
                    }
                }
            }
        }
        for (int x = 0; x < ringSum.length; x++){
            System.out.print(">" + ringSum[x]); 
        }
    }

    public static int[][] sit(int[][] arr){
        int[][] chart = new int [arr.length][arr[0].length]; 
        for(int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[0].length; b++){ 
                int h = (int)(Math.random() * (arr.length));
                int w = (int)(Math.random() * (arr[0].length));
                if (chart[h][w] == 0 ){
                    if ( h != a || w != b ){
                        chart[h][w] = arr[a][b]; 
                    } 
                }
                else{
                    while(chart[h][w]!= 0 ){
                        while ( h == a || w == b ){
                            h = (int)(Math.random() * (arr.length));
                            w = (int)(Math.random() * (arr[0].length));
                        }
                    }
                    chart[h][w] = arr[a][b]; 
                }
            }
        }
        return chart; 
    }
} 
