package chapter3.reviewQuestions;


public class Ex11 {

    public static void main(String[] args) {
        int total = 0;
        StringBuilder letters = new StringBuilder( "abcdefg" );
        total += letters.substring( 1,2 ).length();     /** b - 1 */
        total += letters.substring( 6,6 ).length();     /** "" 0  */
        total += letters.substring( 6,5 ).length();     /** " "  - exception */

        System.out.println(total);   /** 1 */
    }

}
