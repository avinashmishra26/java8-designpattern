package thread.threads;

/**
 * Created by avinash on 17/09/20.
 */
public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
