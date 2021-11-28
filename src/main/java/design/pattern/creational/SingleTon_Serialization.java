package design.pattern.creational;

import java.io.*;

/**
 * Created by avinash on 05/10/20.
 */
public class SingleTon_Serialization {

    public static void main(String[] args){

        try {

            SingleTonSerialization s1 = SingleTonSerialization.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream("singleton.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s1);

            FileInputStream fileInputStream = new FileInputStream("singleton.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SingleTonSerialization s2 =(SingleTonSerialization)objectInputStream.readObject();

            if(s1 != s2){
                System.out.print("s1 not equal to s2");
            }

            if(s1 == s2){
                System.out.print("s1 equal to s2");
            }


        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}


class SingleTonSerialization implements Serializable {

    private static volatile SingleTonSerialization singleTon;

    private SingleTonSerialization(){}

    public static SingleTonSerialization getInstance(){
        if(singleTon == null) {
            synchronized(SingleTonSerialization.class) {
                if(singleTon == null) {
                    singleTon = new SingleTonSerialization();
                }
            }
        }
        return singleTon;
    }

    private Object readResolve() {
        return SingleTonSerialization.getInstance();
    }
}