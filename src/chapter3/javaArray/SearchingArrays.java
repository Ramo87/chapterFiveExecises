package chapter3.javaArray;

import java.util.Arrays;

/**
 * Created by Loky on 30/07/2020.
 */
public class SearchingArrays {   /** !! If the array is NOT sorted, the richt choise for the exam is unpredictable output!!    */

    public int[] numbers = {1,3,5,8,9,12}; //variabila de instanta pt ca nu e statica, tre sa generam un nou obiect, si pt ca e declarata la niveul clasei

    public static void main(String[] args) {

        SearchingArrays a = new SearchingArrays();
        System.out.println( Arrays.binarySearch(a.numbers,2 ));/** ->Result=-1-x = -2(Numai pt un sir ordonat, pozitia normala pe care ar
         lua-o numarul cautat de noi). In our case, 2 should be on the position 1  -> -1-1 = -2 */

        System.out.println( Arrays.binarySearch( a.numbers, 7 ));  /** R = -3 -1 = - 4  */
        System.out.println(Arrays.binarySearch( a.numbers, 10 ));  /** R = -5 -1 = - 6 */
        System.out.println(Arrays.binarySearch( a.numbers, 0 ));   /** R = 0 -1= - 1 */
        System.out.println(Arrays.binarySearch( a.numbers, 13 ));  /** R = -1 -7 = - 8 */

    }

}
