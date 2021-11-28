package java8.InterfaceMethods;

/**
 * Created by avinash on 06/10/20.
 */
public class DefaultMethod  implements Sayable{

    public void sayMore(String msg){        // implementing abstract method
        System.out.println(msg);
    }

    public void say(){   //Default method overridden
        System.out.println("Hello, this is default method Impl");
    }

    public static void main(String[] args) {
        Sayable dm = new DefaultMethod();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method

    }
}

interface Sayable{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
}
