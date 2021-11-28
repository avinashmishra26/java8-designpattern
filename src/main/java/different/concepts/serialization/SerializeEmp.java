package different.concepts.serialization;

import java8.stream.model.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by avinash on 01/10/20.
 */
public class SerializeEmp {

    public static void main(String[] args) throws IOException{

        Age age = new Age(22, 9, 2020);
       Department department = new Department(10, "CS");
       Employee employee = new Employee(1,"Avinash", 10, "Mishra", department, age);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream  objectOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("emp.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        }catch (IOException ex){}
        finally {
            fileOutputStream.close();
            objectOutputStream.close();
        }

        System.out.println("Serialize Employee Object" + employee);
    }
}
