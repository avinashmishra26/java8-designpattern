package different.concepts.OverLoadingAndRidding;

import java.io.IOException;

/**
 * Created by avinash on 02/10/20.
 */
public class MethodOverridingEx {
    public static void main(String args[])throws Exception {
        Animal d1 = new Dog();

        d1.eat();
        d1.bark();
        d1.sleep();
        d1.check_Exception();

        System.out.println("*****************************");


        Dog classMethod = new Dog();
        classMethod.bark();
        classMethod.own_sleep();

        System.out.println("*****************************");



        Animal a1 = new Animal();
        a1.eat();
        a1.bark();
        a1.sleep();
    }
}

class Animal{

    protected Animal eat(){
        System.out.println("eating.");
        return this;
    }

    void check_Exception()throws Exception{
        System.out.println("Animal check Exception.");

    }

    static void bark(){
        System.out.println("Animal bark.");
    }


    final void sleep(){
        System.out.println("Animal sleep.");
    }
}

class Dog extends Animal{

    public Dog eat() {
        System.out.println("Dog is eating.");
        return this;
    }


    void check_Exception()throws IOException{
        System.out.println("Dog check Exception.");

    }

    static void bark(){
        System.out.println("Dog bark.");
    }

    void own_sleep(){
        System.out.println("Dog own sleep.");
    }

}
