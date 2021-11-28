package java8.stream;

/**
 * Created by avinash on 14/09/20.
 */

import java8.stream.model.Product;

import java.util.*;

public class UnderstandWithoutStream {

    public static void main(String[] args) {
           List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));



        List<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productsList){

            // filtering data of list
            if(product.price < 30000){
                productPriceList.add(product.price);    // adding price to a productPriceList
            }
        }
        System.out.println(productPriceList);   // displaying data


    }
}
