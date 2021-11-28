package different.concepts.failFastAndSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by avinash on 07/10/20.
 */
public class FailSafe {

    public static void main(String[] args){

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            map.put("Fifth", 50);
        }

        System.out.print(map);
    }
}
