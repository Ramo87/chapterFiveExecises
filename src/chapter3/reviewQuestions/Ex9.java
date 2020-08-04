package chapter3.reviewQuestions;

public class Ex9 {

    public static void main(String[] args) {

        String s = "purr";
        //s += 2;

        s.toUpperCase(); /** new String (sa zicem): ss = PURR ;  s = purr*/
        s.trim(); /** s = purr */
        s.substring( 1,3 );  /** sss= ur  */
        s += " two";  /**  s = "purr two"  concatanare   */

        System.out.println(s.length());    /** rez: 8 */
    }

}
