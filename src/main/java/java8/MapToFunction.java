package java8;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by avinash on 06/10/20.
 */
public class MapToFunction {

    public static void main(String[] args)
    {
        // Creating an IntStream
        IntStream stream = IntStream.range(3, 8);

        // Creating a Stream of Strings
        // Using IntStream mapToObj(IntFunction mapper)
        // to store binary representation of
        // elements in IntStream
        Stream<String> stream1 = stream.mapToObj(num
                -> Integer.toBinaryString(num));

        // Displaying an object-valued Stream
        // consisting of the results of
        // applying the given function.
        stream1.forEach(System.out::println);

        System.out.println();
        System.out.println("*********************");

        IntStream stream10 = IntStream.of(3, 5, 7, 9, 11);

        // Creating a Stream
        // Using IntStream mapToObj(IntFunction mapper)
        Stream<BigInteger> stream2 = stream10
                .mapToObj(BigInteger::valueOf);

        // Displaying an object-valued Stream
        // consisting of the results of
        // applying the given function.
        stream2.forEach(num -> System.out.println(num.add(BigInteger.TEN)));
    }
}
