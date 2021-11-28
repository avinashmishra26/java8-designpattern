package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by avinash on 06/10/20.
 */
public class FlatMapExp {

    public static void main(String[] args){
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a","z"),
                Arrays.asList("b"));
        System.out.println(list);


        System.out.println(list
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));

    }
}
