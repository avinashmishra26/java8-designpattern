package java8.stringJoiner;

import java.util.StringJoiner;

/**
 * Created by avinash on 06/10/20.
 */
public class StringJoinerExample {
        public static void main(String[] args) {
            StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

            // Adding values to StringJoiner
            joinNames.add("Rahul");
            joinNames.add("Raju");
            joinNames.add("Peter");
            joinNames.add("Raheem");

            System.out.println(joinNames);


            StringJoiner joinNames1 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter

            // Adding values to StringJoiner
            joinNames1.add("Rahul");
            joinNames1.add("Raju");
            joinNames1.add("Peter");
            joinNames1.add("Raheem");

            System.out.println(joinNames1);
        }
    }
