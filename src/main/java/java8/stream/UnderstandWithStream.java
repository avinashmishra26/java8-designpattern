package java8.stream;

import java8.stream.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by avinash on 14/09/20.
 */
public class UnderstandWithStream {


    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        System.out.println(productsList);

        List<Float> res = productsList.stream().filter( p-> p.price < 30000f).map(p-> p.price).collect(Collectors.toList());

        System.out.println(res);   // displaying data


        // See the difference in Map fnc
        List<Float> res1 = productsList.stream().filter( p -> p.price < 30000f).map(Product::getPrice).collect(Collectors.toList());

        System.out.println(res1);   // displaying data


        //print using non-stream
        productsList.forEach( p -> System.out.print(p));

        System.out.println();

        //print using stream
        productsList.stream().map(Product :: getPrice).forEach(System.out::print);

        System.out.println();

        //Removing Map fnc
        productsList.stream().forEach(System.out::print);
    }
}
