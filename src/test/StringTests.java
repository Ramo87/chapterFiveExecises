package test;

/**
 * Created by Loky on 08/07/2020.
 */
public class StringTests {

    public static void main (String [] args){
        String x = "Schüler";
        String y = x;

        System.out.println( "x: " + System.identityHashCode( x) ); //hash code, sertarele din dulap, spunem programului ca un obiect care aceleasi cartesteirsitc e aceleasi cu celalt
        System.out.println( "y: " + System.identityHashCode( y) );

        StringBuilder xa = new StringBuilder("ramo" ).append( 78 ).append( 0.56 );
        xa.append( "doakdskoadk oas" ).append( "dsad" );
        System.out.println(xa);
    }
}
