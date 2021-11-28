package java8.methodReference;

/**
 * Created by avinash on 05/10/20.
 */
public class StaticReference2 {
    public static void ThreadStatus(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t2=new Thread(StaticReference2::ThreadStatus);
        t2.start();
    }
}
