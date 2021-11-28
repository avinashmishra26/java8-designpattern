package java8.lambda;

/**
 * Created by avinash on 14/09/20.
 */
public class TwoParams {

    public static void main(String[] args){

        Addition addition1 = (int a, int b) -> { return a+b;};

        System.out.println(addition1.addNumbers(10,20));

        // WITH 2 Params and Without Return type
        Addition addition2 = (int a, int b) ->  a+b;

        System.out.println(addition1.addNumbers(100,200));
    }
}



@FunctionalInterface
interface Addition{

    public int addNumbers(int a, int b);
}