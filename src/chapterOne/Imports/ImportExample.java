package chapterOne.Imports;

import java.util.ArrayList;
import java.util.Random;

/* "*" - se foloseste numai pentru a importa classe nu si pentru files. */

public class ImportExample {
    java.util.Date date;
    java.sql.Date sqlDate;

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println( r.nextInt( 10 ) );
        java.util.Date date;

        ArrayList list = new ArrayList();
        list.add( "cat" );

        System.out.println( list );
        list.add( "dog" );
        System.out.println( list );

        if (list.isEmpty()) {
            System.out.println( "0" );
        } else {
            System.out.println( "1" );
        }
    }


}
