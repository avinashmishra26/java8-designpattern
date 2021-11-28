package different.concepts.immutable;

/**
 * Created by avinash on 30/09/20.
 */
public class Immutable_Class {

    public static void main(String[] args){
        Student  student = new Student(1, "Avinash");

        System.out.print(student.getName());

        //compile time expection => student.rollNo = 5;
    }
}

final class Student {

    final int rollNo;
    final String name;

    public Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

}

