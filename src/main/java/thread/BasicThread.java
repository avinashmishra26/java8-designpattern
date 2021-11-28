package thread;

import thread.threads.RunnableThread;
import thread.threads.ThreadClass;

/**
 * Created by avinash on 17/09/20.
 */
public class BasicThread {

    public static void main(String[] args) {


        // 1 - way
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();


        // 2 - way
        Thread thread = new Thread(new RunnableThread());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());


        System.out.println("******************************************");

        // 3 - way passing Runnable as a lambda expression
        Thread threadLambda = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        threadLambda.start();

        //4 way
        Thread threadAnno = new Thread(){

                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName());
                }
        };
        threadAnno.start();

        System.out.println("******************************************");

        System.out.println(thread.getState());

    }
}
