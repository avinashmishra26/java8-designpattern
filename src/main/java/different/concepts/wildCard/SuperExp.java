package different.concepts.wildCard;

import java.util.*;

/**
 * Created by avinash on 07/10/20.
 */
public class SuperExp {

    public static void main(String[] args)
    {
        //Lower Bounded Integer List
        List<Integer> list1= new ArrayList<>(Arrays.asList(4,5,6,7));

        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

        //Number list
        List<Number> list2= new ArrayList<>(Arrays.asList(4,5,6,7));

        //Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
    {
        list.add(5);
        System.out.println(list);
    }
}
