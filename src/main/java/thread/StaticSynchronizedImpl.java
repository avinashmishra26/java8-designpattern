package thread;

/**
 * Created by avinash on 29/09/20.
 */
public class StaticSynchronizedImpl {

    public static void main(String[] args){

        Thread thread1 = new Thread( () -> StaticSynchronized.printTable(1));

        Thread thread2 = new Thread( () -> StaticSynchronized.printTable(10));

        Thread thread3 = new Thread( () -> StaticSynchronized.printTable(100));

        Thread thread4 = new Thread( () -> StaticSynchronized.printTable(1000));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}


class StaticSynchronized {

    synchronized static void printTable(int val){
        for(int i=1; i<=10; i++){
            System.out.println(val*i);
        }
    }
}
