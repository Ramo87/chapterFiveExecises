package chapterOne.orderOfInitialization;

/**
 * Created by Loky on 20/07/2020.
 */
public class Chick {

    private String name = "Fluffy";
    {
        System.out.println( name );
    }

    public Chick() {
        name = "Tiny";
        System.out.println( " " );
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println( chick.name );
    }


}
