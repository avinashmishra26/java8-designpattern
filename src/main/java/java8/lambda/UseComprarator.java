package java8.lambda;

/**
 * Created by avinash on 14/09/20.
 */

import java.util.*;

public class UseComprarator {

    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Avinash",32));
        list.add(new Student(22,"Neera",31));
        list.add(new Student(3,"Akash",26));
        list.add(new Student(4,"Mummy",55));

        //ON ID
        System.out.println("Sorting on the basis of ID...");
        Collections.sort(list);
        System.out.println(list);


        //LAMBDA EXPRESSION ON NAME
        System.out.println("Sorting on the basis of name...");
        Collections.sort(list, (Student p1,Student p2) -> p1.name.compareTo(p2.name));
        System.out.println(list);


        //ON AGE
        System.out.println("Sorting on the basis of AGE...");
        Collections.sort(list, new StudentComparator());
        System.out.println(list);
    }
}

class Student implements Comparable<Student> {

    int id;
    String name;
    int age;

    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st1){
        return this.id - st1.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2){
        return st1.age - st2.age;
    }
}
