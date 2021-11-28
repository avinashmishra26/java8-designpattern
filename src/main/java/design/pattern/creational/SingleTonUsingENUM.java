package design.pattern.creational;

/**
 * Created by avinash on 05/10/20.
 */
public class SingleTonUsingENUM {

    public static void main(String[] args) {
        SingleTonEnum singleTonEnum = SingleTonEnum.INSTANCE;

        System.out.println(singleTonEnum.getValue());
        singleTonEnum.setValue(20);
        System.out.println(singleTonEnum.getValue());


        SingleTonEnum singleTonEnum1 = SingleTonEnum.INSTANCE;
        System.out.println(singleTonEnum1.getValue());

        if(singleTonEnum == singleTonEnum1)
            System.out.println("singleTonEnum == singleTonEnum1");
    }

}


enum SingleTonEnum {
    INSTANCE;
    int value;

    SingleTonEnum() {
        System.out.println("constructor SingleTonEnum");
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}