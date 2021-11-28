package different.concepts.serialization;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by avinash on 01/10/20.
 */
public class DesealizeEmp {

    public static void main(String[] args)throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

            fileInputStream = new FileInputStream("emp.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Employee  employee = (Employee)objectInputStream.readObject();

        System.out.print(employee);
    }
}
