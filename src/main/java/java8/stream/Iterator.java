package java8.stream;

import java.util.stream.Stream;

/**
 * Created by avinash on 14/09/20.
 */
public class Iterator {

    public static void main(String[] args){
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);


        System.out.println("***************************");

        Stream.iterate(1, element->element+1)
                .limit(10)
                .filter(element->element%5==0)
                .forEach(System.out::println);
    }
}
