package java8.stream;

import java8.stream.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinash on 18/09/20.
 */
public class Count {


    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        System.out.println(productsList);


        long countVal = productsList.stream().count();

        System.out.println("Total Count :: "+countVal);


        long countValFilter = productsList.stream().filter(p-> p.getPrice() > 25000).count();

        System.out.println("Total Count With Filter :: "+countValFilter);
    }

}
