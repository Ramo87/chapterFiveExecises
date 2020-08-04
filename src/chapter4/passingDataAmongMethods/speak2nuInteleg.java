package chapter4.passingDataAmongMethods;

/**
 * Created by Loky on 04/08/2020.
 */
public class speak2nuInteleg {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak2( name );
        System.out.println( name );

    }
    public static void speak2(StringBuilder s) {
        s.append( "Webby" );
    }
}
