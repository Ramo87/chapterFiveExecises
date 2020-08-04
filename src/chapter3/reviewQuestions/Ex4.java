package chapter3.reviewQuestions;

/**
 * Created by Loky on 01/08/2020.
 */
public class Ex4 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(  );   /**  putem crea un string uilder chiar daca initial e gol */
        sb.append("aaa").insert( 1,"bb" ).insert( 4,"ccc" );
        System.out.println(sb);   /**  rezultat:  abbaccca   */

           /** Daca am vrea sa intelegem diferenta dintre stringBuilder si string, luam exemplu de mai jos:  */
        String s = "_";
        s.concat( "aaa" ).concat( "bb" ).concat( "e" );
        System.out.println(s);  /**  rezultat: _   !Stringul nu se modifica, e imutable,
                                                    codul se compileaza dar stringul nu se modifica.
                                            prin concat() se formeaza alt string, dar "s" ramane la aceeasi valoare!  */


    }


}
