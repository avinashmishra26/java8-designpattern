package different.concepts.serialization;

import java.io.Serializable;

/**
 * Created by avinash on 01/10/20.
 */
public class Employee extends Age implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private  transient long salary;
    private static String lName;
    private Department dep;

    public static String getlName() {
        return lName;
    }

    public Employee(){
        System.out.println("in Employee::default Paramter");
    }

    public Employee(int id, String name, long salary, String lName, Department dep, Age age) {
        super(age.getDay(), age.getMonth(), age.getYear());
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.lName = lName;
        this.dep= dep;
        System.out.println("in Employee::constructor Paramter");
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

    public long getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", lName=" + lName +
                ", Depart=" + dep +
                ", Age=" + super.toString()+
                '}';
    }
}
