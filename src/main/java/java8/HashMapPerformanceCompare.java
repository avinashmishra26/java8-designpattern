package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by avinash on 06/10/20.
 */
public class HashMapPerformanceCompare {

    public static void main(String[] args) {
        Person  person = null;

        Map<Person,String> map = new HashMap<>();

        for(int i=0; i<100000;i++){
            UUID uuid = UUID.randomUUID();
            person = new Person("av",uuid);
            map.put(person,"comment"+i);
        }

        long start = System.currentTimeMillis();
        String newP = map.get(person);
        long end = System.currentTimeMillis();
        System.out.println("value is :" +newP);
        System.out.println("Time Taken :" + (end-start));
    }
}

// Java 8 hashMap improvement is use of red-black balance tree using comparable implementation this adding comparable to class Person.

// When the HashMap implementation tries to find the location of a new entry in the tree, first it checks whether the current and the
// new values are easily comparable (Comparable interface) or not. In the latter case, it has to fall back to a comparison method called
// tieBreakOrder(Object a, Object b). This method tries to compare the two object based on class name first, and then using System.identityHashCode


class Person implements Comparable<Person> {

    private String firstName;
    private UUID id;

    Person(String firstName, UUID id){
        this.firstName = firstName;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    @Override
    public boolean equals(Object obj){

        return this.id.equals(((Person)obj).id);
    }

    @Override
    public String toString(){
        return "UUID is :: "+id;
    }

    @Override
    public int compareTo(Person o) {
        return this.id.compareTo(o.id);
    }
}