package thread;

/**
 * Created by avinash on 29/09/20.
 *
 * A daemon thread is a thread that does not prevent JVM from exiting. When all non-daemon threads are terminated, the JVM simply abandons all
 * remaining daemon threads. Daemon threads are usually used to carry out some supportive or service tasks for other threads, but you should take into
 * account that they may be abandoned at any time.
 *
 * To start a thread as a daemon, you should use the setDaemon() method before calling start():
 */
public class DaemonThread {

    public static void main(String[] args) throws InterruptedException {

        Thread daemon = new Thread(()
                -> {
            try {
                Thread.currentThread().sleep(20000);
                System.out.println("Hello from daemon!");
            }catch (InterruptedException ex) {}
        }
        );
        daemon.setDaemon(true);
        daemon.start();

    }
}
