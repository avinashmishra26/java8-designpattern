package different.concepts.enumStudy;

/**
 * Created by avinash on 05/10/20.
 */
public class EnumWithValues {

    public static void main(String[] args) {

        int season = Season.valueOf("SPRING").getValue();

        System.out.println(season);


        System.out.println(Season.valueOf("SPRING").ordinal());


        for(Season sea: Season.values()) {
            System.out.println(sea);
            System.out.println(sea.getValue());
        }
    }
}


enum Season {
    WINTER(5), SPRING(10), SUMMER(15), FALL(20);

    private int value;

    Season(int val) {
        this.value=val;
    }

    int getValue(){
        return value;
    }
}
