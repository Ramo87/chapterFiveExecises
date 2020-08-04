package chapter3.reviewQuestions;

                                    /** -> !!!  WE can NOT use "==" to compare a String with a StringBuilder !!! <-  */

public class Ex5 {

    public static void main(String[] args) {

    String s1 = "java";
    StringBuilder s2 = new StringBuilder( "java" );
    /**  if(s1==s2)                     --> nu se compileaza! Nu poti compara cu == un strig cu un StringBuilder
        System.out.println("1");    */
    if(s1.equals( s2 ))
        System.out.println("2");

    }
}
