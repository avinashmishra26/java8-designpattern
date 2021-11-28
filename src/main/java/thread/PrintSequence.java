package thread;

import thread.blockingQueue.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by avinash on 11/10/20.
 */
public class PrintSequence {

    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue blockingQueue = new ArrayBlockingQueue<>(1);
    }
}


class Odd {

    void Print(java.util.concurrent.BlockingQueue blockingQueue){
        int i=1;
        while(true) {
            System.out.print(i);
            i = +2;
        }
    }
}

class Even {

    void Print(java.util.concurrent.BlockingQueue blockingQueue){
        int i=2;
        while(true) {
            System.out.print(i);
            i = +2;
        }
    }
}