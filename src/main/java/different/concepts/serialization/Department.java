package different.concepts.serialization;

import java.io.Serializable;

/**
 * Created by avinash on 01/10/20.
 */
public class Department implements Serializable{

    private static final long serialVersionUID = 1L;

    int id;
    String departname;

    public Department(int id, String departname) {
        this.id = id;
        this.departname = departname;
        System.out.println("in Department::constructor Paramter");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departname='" + departname + '\'' +
                '}';
    }
}
