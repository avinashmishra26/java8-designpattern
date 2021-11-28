package java8.lambda;

/**
 * Created by avinash on 05/10/20.
 */
public class LambdaThread {

    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(
                () -> {
                    Loop.looping();
                    System.out.print("in thread execution");
                }
        );
        thread.start();


        thread.join();
        System.out.print("in main thread");
    }
}


class Loop {

    static void looping(){
        for(long i=0;i<999999999;i++);
    }
}
