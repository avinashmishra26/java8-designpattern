package different.concepts.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by avinash on 01/10/20.
 */
public class AccountDetail implements Serializable{

    private String username;
    private transient String password;
    private transient String gender;

    public AccountDetail(String username, String password, String gender) {
        this.username = username;
        this.password = password;
        this.gender= gender;
    }

    private void writeObject(ObjectOutputStream oos)throws Exception {
        oos.defaultWriteObject();
        // epwd (encrypted password)
        String epwd = "123" + password;

        // writing encrypted password to the file
        oos.writeObject(epwd);

        oos.writeObject(gender.substring(0,1));
    }

    private void readObject(ObjectInputStream ois)throws Exception{
        ois.defaultReadObject();
        String pass = (String)ois.readObject();

        password = pass.substring(3);

        gender = (String)ois.readObject();
    }

    @Override
    public String toString() {
        return "AccountDetail{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
