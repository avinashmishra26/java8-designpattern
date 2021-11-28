package thread.blockingQueue;

/**
 * Created by avinash on 29/09/20.
 */
public class BlockingQueueImpl {


    public static void main(String[] args)throws InterruptedException  {

        BlockingQueue<String> names = new BlockingQueue<>();


        ThreadPut threadPut = new ThreadPut("Avinash", names);


        ThreadGet threadGet = new ThreadGet(names);
        threadGet.start();

        threadPut.start();
    }
}


class ThreadPut extends Thread {

    String name;
    BlockingQueue<String> queue;

    ThreadPut(String name, BlockingQueue<String> queue) {
        this.name=name;
        this.queue=queue;
    }

    @Override
    public void run(){
        try {
            this.queue.put(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class ThreadGet extends Thread {

    BlockingQueue<String> queue;

    ThreadGet(BlockingQueue<String> queue) {
        this.queue=queue;
    }

    @Override
    public void run(){
        try {
            System.out.print(this.queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
