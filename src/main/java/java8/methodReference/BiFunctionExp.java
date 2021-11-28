package java8.methodReference;

import java.util.function.BiFunction;

/**
 * Created by avinash on 05/10/20.
 */
public class BiFunctionExp {


    public static float multiple(Float a, Float b){
        return a*b;
    }

    public static void main(String[] args){

        BiFunction<Integer, Float, Float>  biFunction = (Integer a,Float b)-> (a+b) ;
        System.out.println(biFunction.apply(2,3.06f));

        BiFunction<Integer, Float, Float>  biFunction1 = (Integer a,Float b)-> (a+b) ;
        biFunction1 = biFunction1.andThen(res -> res*10);
        System.out.println(biFunction1.apply(2,3.06f));


        BiFunction<Float, Float, Float> biFunction2 = BiFunctionExp :: multiple;
        System.out.println(biFunction2.apply(5f,9f));
    }
}
