package chapter3.stringBuilderExercises;

/**
 * Created by Loky on 28/07/2020.
 */
public class ComparingStringBuilderWithStrings {  /** am incercat sa demonstrez ca un string nu poate fi modificat, iar un stringbuilder poate.
    //ca de fiecare se genereaza un alt string; iar pentru stringbuilder nu este la fel. */

    private String alpha = "b";
    private StringBuilder blpha = new StringBuilder();


    public static void main(String[] args) {
        ComparingStringBuilderWithStrings sb = new ComparingStringBuilderWithStrings();

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            sb.alpha += alphabet;
            System.out.println( "sb.alpha: " + sb.alpha );

        }
        System.out.println( sb.alpha.length() ); /**26 im Gesamt, das bedeutet wir haben 26 neue Strings generiert */

        System.out.println( "-------------------------------------------------------" );


        ComparingStringBuilderWithStrings $sb = new ComparingStringBuilderWithStrings();

        for (char current = 'a'; current <= 'z'; current++) {
            $sb.blpha.append( current ); /**this string reuses the old one, without to create a new one each time;*/
            System.out.println( "$sb.blpha: " + $sb.blpha );
            System.out.println( "$sb.blpha - length: " + $sb.blpha.length() );
        }

        System.out.println( sb.alpha.equals( $sb.blpha ) );

                     /**  3 ways to construct a StringBuilder:  */
            StringBuilder r1 = new StringBuilder(  );
            StringBuilder r2 = new StringBuilder( "animal" );
            StringBuilder r3 = new StringBuilder( 10 );  /** Size is 0, capacity = 10; how big the eventual value will be.*/

            /** size vs capacity:
            1. Size = the number of characters currently in the sequence
            2. Capacity = the number of characters the sequence cen currently hold.
                        = the default capacity for StringBuilder is 16, if is nor settled from the programmer
            */
    }
}
