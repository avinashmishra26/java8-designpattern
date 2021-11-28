package java8.InterfaceMethods;

/**
 * Created by avinash on 06/10/20.
 */
public class StaticMethods implements SayableTest {

    public void sayMore(String msg){     // implementing abstract method
        System.out.println(msg);
    }

    static void sayLouder(String msg){
        System.out.println(msg+"in StaticMethods");
    }

    public static void main(String[] args) {
        SayableTest dm = new StaticMethods();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        SayableTest.sayLouder("Helloooo...");   // calling static method

        StaticMethods.sayLouder("Helloooo...");   // calling static method
    }
}

interface SayableTest{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }


    // Abstract method
    void sayMore(String msg);


    // static method
    static void sayLouder(String msg){
        System.out.println(msg+"in SayableTest");
    }
}
