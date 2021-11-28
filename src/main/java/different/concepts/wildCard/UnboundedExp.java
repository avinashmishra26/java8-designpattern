package different.concepts.wildCard;

import java.util.*;

/**
 * Created by avinash on 07/10/20.
 */
public class UnboundedExp {
    public static void main(String[] args)
    {

        //Integer List
        List<Integer> list1=  new ArrayList<>(Arrays.asList(1,2,3));

        //Double list
        List<Double> list2=Arrays.asList(1.1,2.2,3.3);

        printlist(list1);

        printlist(list2);
    }

    private static void printlist(List<?> list)
    {

        //list.add(5); ERROR
        System.out.println(list);
    }
}
