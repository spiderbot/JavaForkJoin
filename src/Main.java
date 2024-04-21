import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task = new ForkJoinTask(0,600);
        // learn about invoke(), submit(), execute() and their differences
        Integer result = pool.invoke(task);
        System.out.println("Demo Complete with result " + result);
    }
}