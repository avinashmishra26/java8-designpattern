package thread.runnableCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by avinash on 30/09/20.
 */
public class RunnableExp {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new EventLoggingTask());
        executorService.shutdown();
    }


}


class EventLoggingTask implements  Runnable{


    @Override
    public void run() {
        System.out.println("in RunnableExp");
    }
}