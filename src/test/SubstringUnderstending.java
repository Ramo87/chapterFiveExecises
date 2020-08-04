package test;

/**
 * Created by Loky on 20/07/2020.
 */
public class SubstringUnderstending {

    public static void main(String[ ] args){
        String string ="substringUnderstanding";


        System.out.println(string.substring( 3,3 ));

        String result = string.substring(3, 3);

        System.out.println("result == null ? -> " + (result == null));
        System.out.println("result.isEmpty =() ? -> " + result.isEmpty());


        String NULL = null;
        String EMPTY = "";

        System.out.println( "Rererenz id den String Poll Speicher");
        System.out.println("---\nString NULL = null;");
        System.out.println( Integer.toHexString(System.identityHashCode(NULL)));
        System.out.println(Integer.toHexString( System.identityHashCode( EMPTY ) ));
        NULL = "Nicht mehr NULL!";


    }
}
