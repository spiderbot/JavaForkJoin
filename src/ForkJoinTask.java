import java.util.concurrent.RecursiveTask;

public class ForkJoinTask extends RecursiveTask<Integer> {

    int start ;
    int end;
    ForkJoinTask(int start, int end){
        this.start = start;
        this.end = end;
    }
    protected Integer compute(){
        // this is the base case
            if(end - start <= 10){
                int sum = 0;
                for(int i=start;i<end;i++){
                    sum = sum + i;
                }
                return sum;
            }else{
                int mid = (start + end) / 2;
                ForkJoinTask left = new ForkJoinTask(start, mid);
                ForkJoinTask right = new ForkJoinTask(mid , end);
                 left.fork() ;
                return left.join() + right.compute();
            }
    }
}
