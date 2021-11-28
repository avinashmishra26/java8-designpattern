package different.concepts.OverLoadingAndRidding;

/**
 * Created by avinash on 02/10/20.
 */
public class MethodOverloadingEx {

    static int add(int a, int b){return a+b;}
    static int add(int a, int b, int c){return a+b+c;}

    public static void main(String args[]) {
        System.out.println(add(4, 6));
        System.out.println(add(4, 6, 7));
    }
}
