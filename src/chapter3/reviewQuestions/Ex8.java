package chapter3.reviewQuestions;

/**  Substring are 3 forme: (index 1, index 2) : [)   - include indexul 1 sau se opreste fix inainte de indexul 2.
 *                              sau
 *                              (index 1):   []   - include indexul 1 si merge pana la finalul stringului.
 *
 *
 * */


public class Ex8 {

    public static void main(String[] args) {

        String numbers = "012345678";
        System.out.println(numbers.substring( 1,3 ));   /**  rez: 12 */
        System.out.println(numbers.substring( 7,7 ));   /** rez:  " " */
        System.out.println(numbers.substring( 7 ));     /** rez:  78 */
        System.out.println(numbers.substring(7,6));     /** !!!! exceptie! rez: -1!!!  */

    }


}
