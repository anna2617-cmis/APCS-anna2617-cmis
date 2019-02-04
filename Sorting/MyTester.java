public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 100000;
        int[] array = Util.getArray(n, at);
        int[] tmp = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
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
            for(int i = 0; i < array.length; i++){
                array[i] = tmp[i];
            }
            BubbleSort.steps = 0; 
        }

        long avg = (long) (total / (double)run); 
        long avgStep = (long) (step / (double)run); 
        
        System.out.format("Bubble Average steps: %d\n", avgStep);
        total = 0;
        step = 0; 
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            SelectionSort.sort(array);
            btime = System.nanoTime() - start;
            step += SelectionSort.steps; 
            total += btime; 
            for(int i = 0; i < array.length; i++){
                array[i] = tmp[i];
            }
            SelectionSort.steps = 0; 
        }

        avg = (long) (total / (double)run); 
        avgStep = (long) (step / (double)run); 
        
        System.out.format("Selection Average steps: %d\n", avgStep);
        total = 0;
        step = 0; 
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            InsertionSort.sort(array);
            btime = System.nanoTime() - start;
            step += InsertionSort.steps; 
            total += btime; 
            for(int i = 0; i < array.length; i++){
                array[i] = tmp[i];
            }
            InsertionSort.steps = 0; 
        }

        avg = (long) (total / (double)run); 
        avgStep = (long) (step / (double)run); 
        
        System.out.format("Insertion Average steps: %d\n", avgStep);
        total = 0;
        step = 0;
        for(run = 0; run < 50; run++){
            start = System.nanoTime();
            MergeSort.sort(array);
            btime = System.nanoTime() - start;
            step += MergeSort.steps;
            total += btime; 
            for(int i = 0; i < array.length; i++){
                array[i] = tmp[i];
            }
            MergeSort.steps = 0; 
        }

        avg = (long) (total / (double)run); 
        avgStep = (long) (step / (double)run); 
        
        System.out.format("Merge Average steps: %d\n", avgStep);
        total = 0;
        step = 0;
    }
}
