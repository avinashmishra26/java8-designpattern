package design.pattern.creational;

import java.lang.reflect.Constructor;

/**
 * Created by avinash on 05/10/20.
 */
public class SingleTon_Reflection_issue {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();

        try {
            Constructor constructor = singleTon.getClass().getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);

            SingleTon singleTon2 = (SingleTon)constructor.newInstance();


            if(singleTon != singleTon2) {
                System.out.print("Both are different objects");
            }


        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }

}
