public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 10;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        System.out.println("UNSORTED");
        Util.print(array);
        
        long total = 0; 
        int run; 
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            total += btime; 
            array = tmp;; 
        }
        
        long avg = (long) (total / (double)run); 
        System.out.println (avg); 
        total =0;
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            SelectionSort.sort(array);
            btime = System.nanoTime() - start;
            total += btime; 
            array = tmp;; 
        }
        
        avg = (long) (total / (double)run); 
        System.out.println (avg); 
        total =0;
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            InsertionSort.sort(array);
            btime = System.nanoTime() - start;
            total += btime; 
            array = tmp;; 
        }
        
        avg = (long) (total / (double)run); 
        System.out.println (avg);
        total =0;
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            MergeSort.sort(array);
            btime = System.nanoTime() - start;
            total += btime; 
            array = tmp;; 
        }
        
        avg = (long) (total / (double)run); 
        System.out.println (avg);
        total =0;
    }
}
