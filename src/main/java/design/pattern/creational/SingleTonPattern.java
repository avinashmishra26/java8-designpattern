package design.pattern.creational;

/**
 * Created by avinash on 05/10/20.
 */
public class SingleTonPattern {

    static SingleTon instance1;
    static SingleTon instance2;

    static public SingleTon getInstance1() {
        return instance1;
    }

    static public void setInstance1(SingleTon instance) {
        instance1 = instance;
    }

    static public SingleTon getInstance2() {
        return instance2;
    }

    static public void setInstance2(SingleTon instance) {
        instance2 = instance;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread() {
            public void run() {
                SingleTon s1 = SingleTon.getInstance();
                SingleTonPattern.setInstance1(s1);
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            public void run() {
                SingleTon s2 = SingleTon.getInstance();
                SingleTonPattern.setInstance2(s2);
            }
        };
        thread2.start();

        thread1.join();
        thread2.join();


        System.out.println("instance1"+instance1);
        System.out.println("instance2"+instance2);

        if(instance1 == instance2) {
            System.out.print("s1 equal to s2");
        }
    }
}

class SingleTon {

    private static volatile SingleTon singleTon;

    private SingleTon(){}

    public static SingleTon getInstance(){
        if(singleTon == null){
            synchronized(SingleTon.class) {
                if(singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}