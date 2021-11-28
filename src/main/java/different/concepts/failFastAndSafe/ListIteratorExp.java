package different.concepts.failFastAndSafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by avinash on 07/10/20.
 */
public class ListIteratorExp {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));

        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();

            if(number ==2)
                iterator.add(50);   //Adding element
        }

        System.out.print(numbers);
    }
}
