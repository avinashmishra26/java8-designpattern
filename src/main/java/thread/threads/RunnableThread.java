package thread.threads;

/**
 * Created by avinash on 18/09/20.
 */
public class RunnableThread implements Runnable {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
