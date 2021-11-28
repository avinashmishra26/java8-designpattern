package java8.lambda;

/**
 * Created by avinash on 14/09/20.
 *
 * Lambda expression provides implementation of functional interface.
 * An interface which has only one abstract method is called functional interface.
 * Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
 */
public class LambdaExpUnderstanding {

    public static void main(String[] args){


        //WITHOUT LAMBDA EXPRESSION
        StringNullCheck stringNullCheck = new StringNullCheck(){

            @Override
            public boolean isNull(String arg){
                return arg==null ?  true : false;
            }
        };

        System.out.println(stringNullCheck.isNull("avinash"));
        System.out.println(stringNullCheck.isNull(null));




        //WITH LAMBDA EXPRESSION
        StringNullCheck stringNullCheck1 = (String data) -> { return data==null ? true : false ;};

        System.out.println(stringNullCheck1.isNull("avinash"));
        System.out.println(stringNullCheck1.isNull(null));


    }
}



@FunctionalInterface  //It is optional
interface StringNullCheck {

    boolean isNull(String arg);
}

