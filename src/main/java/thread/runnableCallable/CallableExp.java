package thread.runnableCallable;

import java.util.concurrent.*;

/**
 * Created by avinash on 30/09/20.
 */
public class CallableExp {


    public static void main(String[] args)throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new FactorialTask(5));
        executorService.shutdown();
        System.out.println(future.get().toString());


        System.out.println("****************");

        Callable[] runnables = {new FactorialTask(3), new FactorialTask(4)};

        ThreadPoolExecutor executorService1 = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);
        Future future1 = executorService1.submit(runnables[0]);
        Future future2 = executorService1.submit(runnables[1]);

        Future future3 = executorService1.submit(runnables[0]);
        Future future4 = executorService1.submit(runnables[1]);

        System.out.println("pool size ::"+executorService1.getPoolSize());
        System.out.println("queue size ::"+executorService1.getQueue());


        executorService1.shutdown();
        System.out.println(future1.get().toString());
        System.out.println(future2.get().toString());

        System.out.println("pool size ::"+executorService1.getPoolSize());
        System.out.println("queue size ::"+executorService1.getQueue());

    }
}


class FactorialTask implements Callable<Integer> {
    int number;

    FactorialTask(int number) {
        this.number=number;
    }

    @Override
    public Integer call() throws AvinashException {
        int fact = 1;

        if(number < 0) {
            throw new AvinashException("Number should be positive");
        }

        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}

class AvinashException extends Exception {

    AvinashException(String msg){
        super(msg);
    }
}