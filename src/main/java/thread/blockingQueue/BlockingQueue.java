package thread.blockingQueue;

import java.util.*;

/**
 * Created by avinash on 29/09/20.
 */
public class BlockingQueue<T> {

    Queue<T> queue = new LinkedList<T>();
    private int limit = 10;

    public synchronized void put(T item) throws InterruptedException {

        if(queue.size() == limit){
            wait();
        }

        if(queue.isEmpty()) {
           notifyAll();
        }
        queue.add(item);
    }


    public synchronized T take() throws InterruptedException {

        if(queue.isEmpty()){
            wait();
        }

        if(queue.size() == limit){
            notifyAll();
        }

        return queue.poll();
    }


}
