package java8.methodReference;

/**
 * Created by avinash on 05/10/20.
 */
public class InstanceMethod {
    public void saySomething(){
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
        InstanceMethod methodReference = new InstanceMethod(); // Creating object
        // Referring non-static method using reference
        Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayable sayable2 = new InstanceMethod()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }
}
