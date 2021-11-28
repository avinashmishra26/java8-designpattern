package different.concepts.failFastAndSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by avinash on 07/10/20.
 */
public class ImmutableList {
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("Geeks");

        // Create ImmutableList from List using copyOf()
        List<String> iList = Collections.unmodifiableList(list);

        // We change List and the changes reflect in iList.
        list.add("For");
        list.add("Geeks");

        //iList.add("not work");  Will throw error

        System.out.println(iList);


    }
}
