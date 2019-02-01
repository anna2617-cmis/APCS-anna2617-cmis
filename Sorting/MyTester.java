public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 100;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        System.out.println("UNSORTED");
        Util.print(array);
        
        long total = 0; 
        long step = 0; 
        int run; 
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            step += BubbleSort.steps; 
            total += btime; 
            array = tmp;
            BubbleSort.steps = 0; 
        }
        
        long avg = (long) (total / (double)run); 
        long avgStep = (long) (step / (double)run); 
        System.out.format("Bubble Average time: %d\n", avg); 
        System.out.format("Bubble Average steps: %d\n", avgStep);
        total = 0;
        step = 0; 
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            SelectionSort.sort(array);
            btime = System.nanoTime() - start;
            step += SelectionSort.steps; 
            total += btime; 
            array = tmp;
            SelectionSort.steps = 0; 
        }
        
        avg = (long) (total / (double)run); 
        avgStep = (long) (step / (double)run); 
        System.out.format("Selection Average time: %d\n", avg); 
        System.out.format("Selection Average steps: %d\n", avgStep);
        total = 0;
        step = 0; 
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            InsertionSort.sort(array);
            btime = System.nanoTime() - start;
            step += InsertionSort.steps; 
            total += btime; 
            array = tmp;
            InsertionSort.steps = 0; 
        }
        
        avg = (long) (total / (double)run); 
        avgStep = (long) (step / (double)run); 
        System.out.format("Insertion Average time: %d\n", avg); 
        System.out.format("Insertion Average steps: %d\n", avgStep);
        total = 0;
        step = 0;
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            MergeSort.sort(array);
            btime = System.nanoTime() - start;
            step += MergeSort.steps;
            total += btime; 
            array = tmp;
            MergeSort.steps = 0; 
        }
        
        avg = (long) (total / (double)run); 
        avgStep = (long) (step / (double)run); 
        System.out.format("Merge Average time: %d\n", avg); 
        System.out.format("Merge Average steps: %d\n", avgStep);
        total = 0;
        step = 0;
    }
}
