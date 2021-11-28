package java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinash on 14/09/20.
 */
public class LambdaForEach {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("def");
        list.add("xyz");

        list.forEach(
            val -> System.out.println(val)
        );

        list.forEach(System.out::println);

    }
}
