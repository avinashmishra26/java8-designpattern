package different.concepts;

import com.sun.javafx.binding.Logging;

import java.util.ArrayList;

/**
 * Created by avinash on 09/10/20.
 */
public class ClassLoaders {

    public static void main(String[] args)throws ClassNotFoundException
    {

        printClassLoaders();
    }

    static public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class:"
                + ClassLoaders.class.getClassLoader());

        System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }

}
