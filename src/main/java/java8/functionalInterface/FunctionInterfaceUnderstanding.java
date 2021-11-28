package java8.functionalInterface;

/**
 * Created by avinash on 14/09/20.
 */
public class FunctionInterfaceUnderstanding implements Sayable {

    @Override
    public void say(String msg) {
        System.out.print(msg);
    }

    public static void main(String[] args){
        Sayable sayable = new FunctionInterfaceUnderstanding();
        sayable.say("I am Avinash");
    }

}

@FunctionalInterface
interface Sayable {
    void say(String msg);

    // Functional Interface can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}