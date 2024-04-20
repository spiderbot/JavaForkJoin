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

            }
    }
}
