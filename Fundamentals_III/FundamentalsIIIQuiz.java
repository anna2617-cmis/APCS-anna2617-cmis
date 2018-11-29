public class FundamentalsIIIQuiz{
    public static void main(String[] args){
        int[][] array1 = {{606, -11778, 14724, 19623},
                {-9474, 12334, 2791, -13518},
                {-13681, -8397, -6940, -726},
                {-2978, 7212, 2201, 6735}};

        int[][] array2 = {{-11882, -4377, 5226, -664, -1108, 7142, 2017},
                {7071, -8942, -13904, -17035, -2606, -11831, -13766},
                {-12234, -9534, -15779, 13615, 10270, -6859, 6361},
                {-6033, -549, -15958, 17019, -9666, -4876, -6368}};

        int[][] array3 = {{-5487, -18628, 3365, -14728, 10979},
                {-11403, 13387, -10335, -10113, -12000},
                {-10585, -18889, 15515, -16093, -6097},
                {-17722, 9392, -13208, -17901, -6223},
                {-14081, -10776, -6435, -13976, 2823},
                {-13029, -8753, -5213, -3666, 13910},
                {16639, -11206, -14375, 8119, -9044},
                {7253, -11243, -9436, -14244, -15883}};

    }

    public static boolean allGreater(int[][] array, int threshold){
        /*
         * allGreater should return true if every value in array is strictly greater than threshold
         */
        boolean result = true; 
        for (int a = 0; a < array.length; a++){
            for (int b = 0; b < array[a].length; b++){
                if (array[a][b] < threshold){
                    result = false; 
                }
            } 
        }
        return result; 
    }

    public static int[][] invertSign(int[][] array, boolean positive){
        /*
         * invertSigne should return a new array with the signs inverted to all positive if positive is true
         * and all negative if positive is false.
         */ 
        int [][] output = new int [array.length][array[0].length];
        if (positive){
            for (int a = 0; a < array.length; a++){
                for (int b = 0; b < array[a].length; b++){
                    if (array[a][b] < 0){
                        output[a][b] = -1 * array[a][b]; 
                    }else{
                        output[a][b] = array[a][b]; 
                    }
                } 
            }
        }else{
            for (int a = 0; a < array.length; a++){
                for (int b = 0; b < array[a].length; b++){
                    if (array[a][b] > 0){
                        output[a][b] = -1 * array[a][b]; 
                    }else{
                        output[a][b] = array[a][b]; 
                    }
                } 
            }
        }
        return output; 
    }

    public static int[][] swapColumns(int[][] array, int c1, int c2){
        /*
         * swapColumns should return a new array with the values in columns c1 and c2 from array swapped
         */
        int [][] output = new int [array.length][array[0].length];
        for (int a = 0; a < array.length; a++){
            for (int b = 0; b < array[a].length; b++){
                if (b == c1){
                    output[a][c2] = array[a][c1]; 
                }else if (b == c2){
                    output[a][c1] = array[a][c2];
                }else{
                    output[a][b] = array[a][b];
                }
            } 
        }
        return output; 
    } 

}