package java8.stringStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by avinash on 06/10/20.
 */
public class BasicStringUse {


    public static void main(String[] args)
    {
        String[] p= {"avi","chintu"};

        System.out.println(doJoin(p));;

        String p1= "avi,chintu";

        System.out.println(doSplit(p1));

        String p2= "avi,chintu";

        System.out.println(doCharList(p2));;

    }

    static String doJoin(String[] vals){
        return Arrays.asList(vals).stream().collect(Collectors.joining(",","[","?"));
    }

    static List<String> doSplit(String vals){
        return Stream.of(vals.split(",")).map(s -> new String(s)).collect(Collectors.toList());
    }

    static List<Character> doCharList(String vals){
        return vals.chars().mapToObj(n -> (char)n).collect(Collectors.toList());

    }
}
