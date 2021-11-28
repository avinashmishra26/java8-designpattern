package different.concepts.enumStudy;

/**
 * Created by avinash on 05/10/20.
 */
public enum MainWithEnum {

    WINTER, SUMMER, SPRING, FALL;

    public static void main(String[] args) {

        for(MainWithEnum season: MainWithEnum.values()) {
            System.out.println(season);
        }
    }
}
