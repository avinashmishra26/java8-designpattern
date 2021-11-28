package thread.producerConsumer;

/**
 * Created by avinash on 18/09/20.
 */
public class PCimpl {

    public static void main(String[] args)throws InterruptedException  {

        // Object of a class that has both produce()
        // and consume() methods
        ProducerConsumer producerConsumer = new ProducerConsumer();


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    producerConsumer.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }
}
