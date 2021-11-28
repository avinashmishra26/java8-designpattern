package java8.stream;

import java8.stream.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avinash on 15/09/20.
 */
public class Reduce {

    public static void main(String[] args){

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        System.out.println(productsList);



        //Adding all the price
        float res = productsList.stream().map(product->product.price)
                             .reduce(0f, (sum,element) -> sum+element);

        System.out.println(res);   // displaying data

        float res1 = productsList.stream().map(product->product.price)
                .reduce(0f, Float::sum);

        System.out.println(res1);   // displaying data
    }
}
