package different.concepts.serialization;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by avinash on 07/10/20.
 */
public class CollectionSerialize {

    public static void main(String[] args) {
        Set<String>  strings = new HashSet<>();
        strings.add("maths");
        strings.add("science");
        Student student = new Student(1, "Avi", strings,99);
        //Student student1 = new Student(1, "Avinash", strings);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serColl.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            System.out.println(student);

            FileInputStream fileInputStream = new FileInputStream("serColl.txt");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            Student student1 = (Student)objectInputStream.readObject();

            System.out.print(student1);

        }catch (Exception ex) {}
    }
}

class Student implements Serializable {
    private int roll;
    private String name;
    private Set<String> subjects;
    private transient int marks;

    public Student(int roll, String name, Set<String> subjects, int marks) {
        this.roll = roll;
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }
}
