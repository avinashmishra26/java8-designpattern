package java8.methodReference;

/**
 * Created by avinash on 05/10/20.
 */
public class ConstructorMethod {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}


interface Messageable{
    Message getMessage(String msg);
}
class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}
