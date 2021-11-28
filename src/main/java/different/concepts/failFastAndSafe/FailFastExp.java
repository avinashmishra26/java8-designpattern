package different.concepts.failFastAndSafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by avinash on 07/10/20.
 */
public class FailFastExp {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            numbers.add(50);
        }

        System.out.print(numbers);
    }
}
