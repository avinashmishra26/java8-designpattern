package java8.stream;

import java8.stream.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinash on 18/09/20.
 */
public class MaxMin {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        System.out.println(productsList);

        Product productA = productsList.stream().max((num1, num2) -> num1.getPrice() > num2.getPrice() ?  1 : -1).get();

        System.out.println(productA.getPrice());

        Product productB = productsList.stream().max((num1, num2) -> num1.getPrice() < num2.getPrice() ? 1: -1).get();

        System.out.println(productB.getPrice());

    }
}
