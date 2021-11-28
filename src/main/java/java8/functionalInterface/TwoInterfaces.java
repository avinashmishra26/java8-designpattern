package java8.functionalInterface;

/**
 * Created by avinash on 14/09/20.
 */
public class TwoInterfaces implements SayableTest{

    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args){
        SayableTest sayable = new TwoInterfaces();
        sayable.say("Hello there");
        sayable.doIt();
        Doable.doItStatic();

    }
}


//In the following example, a functional interface is extending to a non-functional interface.

@FunctionalInterface
interface SayableTest extends Doable{
    void say(String msg);   // abstract method
}

interface Doable {
    default void doIt(){
        System.out.println("Do it now");
    }

    static void doItStatic() { System.out.println("Do it static");}
}
