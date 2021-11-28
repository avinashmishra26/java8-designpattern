package java8.lambda;

/**
 * Created by avinash on 14/09/20.
 */
public class OneParam {

    public static void main(String[] args){

        String msg ="I am avinash, ";

        // Lambda expression with single parameter.
        Sayable s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));




        // You can omit function parentheses
        Sayable s2 = name -> {
            return "Hello, "+name;
        };
        System.out.println(s2.say("Sonoo"));

        Sayable s3 = (message) -> {
            return msg+message;
        };

        System.out.println(s3.say("I am not fool"));

    }
}




interface Sayable{
    public String say(String name);
}
