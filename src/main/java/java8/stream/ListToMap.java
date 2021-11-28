package java8.stream;

import java8.stream.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by avinash on 18/09/20.
 */
public class ListToMap {


    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        System.out.println(productsList);

        Map<Integer, Product> map = productsList.stream().collect(Collectors.toMap(p->p.getId(), p->p));

        for(Map.Entry<Integer,Product> mp : map.entrySet()){
            System.out.print(" Key :: " +mp.getKey());
            System.out.print(" Value :: " +mp.getValue());

            System.out.println();
        }


        System.out.println("WITH FILTER");

        //WITH FILTER

        Map<Integer, Product> map1 = productsList.stream().filter(p-> p.getPrice() > 25000f).collect(Collectors.toMap(p->p.getId(), p->p));

        for(Map.Entry<Integer,Product> mp : map1.entrySet()){
            System.out.print(" Key :: " +mp.getKey());
            System.out.print(" Value :: " +mp.getValue());

            System.out.println();
        }

    }
}
