package different.concepts.serialization;

import java.io.*;

/**
 * Created by avinash on 01/10/20.
 */
public class AccountDetailSerDes {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AccountDetail accountDetail = new AccountDetail("avmishra","password", "MALE");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("acc.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accountDetail);
        }catch (IOException ex){}
        finally {
            fileOutputStream.close();
            objectOutputStream.close();
        }

        System.out.println("Serialize accountDetail Object =>" + accountDetail);



        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        fileInputStream = new FileInputStream("acc.txt");
        objectInputStream = new ObjectInputStream(fileInputStream);
        AccountDetail  accountDetail1 = (AccountDetail)objectInputStream.readObject();

        System.out.print(accountDetail1);
    }
}
