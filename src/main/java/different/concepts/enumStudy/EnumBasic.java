package different.concepts.enumStudy;

/**
 * Created by avinash on 05/10/20.
 */
public class EnumBasic {

    public enum Season {
        WINTER, SUMMER, SPRING, FALL
    }

    public static void main(String[] args) {

        for(Season season: Season.values()) {
            System.out.println(season);
        }

        System.out.println(Season.valueOf("WINTER").ordinal());
        System.out.println(Season.valueOf("SPRING").ordinal());

        System.out.println(Season.valueOf("SPRING"));
    }
}
