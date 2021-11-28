package different.concepts.CreateObjectBy5Ways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by avinash on 02/10/20.
 */
public class Impl {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {


        Employee employee = new Employee(1, "Avi");
        System.out.println(employee);

        Employee employee1 = Employee.class.newInstance(); // need default constructor
        Employee employee2 = (Employee)Class.forName("different.concepts.CreateObjectBy5Ways.Employee").newInstance(); // need default constructor
        System.out.println(employee1);
        System.out.println(employee2);



        Constructor<Employee> employee3 = Employee.class.getConstructor();
        Employee employee4 = (Employee)employee3.newInstance();

        System.out.println(employee4);

        //Clone

        //Serialization

    }
}

class Employee {
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
