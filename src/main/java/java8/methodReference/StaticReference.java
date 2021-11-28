package java8.methodReference;

/**
 * Created by avinash on 05/10/20.
 */
public class StaticReference {

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args){
        Sayable say = StaticReference :: saySomething;

       say.say();
    }
}

interface Sayable {
    void say();
}
