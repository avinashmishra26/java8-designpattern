package java8.stringStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

/**
 * Created by avinash on 06/10/20.
 */
public class ReverseString {

    public static <T> Collector<T, ?, Stream<T> > reverseStream()
    {
        return Collectors
                .collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream();
                        });
    }

    // Driver code
    public static void main(String[] args)
    {

        // Get the parallel stream
        List<Integer> lists = Arrays.asList(11, 22, 33, 44);
        Stream<Integer> stream = lists.parallelStream();

        // Reverse and print the elements
        stream.collect(reverseStream())
                .forEach(System.out::println);
    }
}
