package chapter3.javaArray;

import java.util.Arrays;

/**
 * Created by Loky on 30/07/2020.
 */
public class UsingArrays {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
        System.out.println("--------------------------");

       /* numbers[8] = 3;  -- NU inteleg ce vrea de la mine, pagina 124
        numbers[numbers.length] = 5;

        for(int i = 0; i <= numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        } */

       int[] numbers1 = {6, 9, 1};
        Arrays.sort( numbers1 );
        for(int i = 0; i<numbers1.length; i++){
            System.out.println( numbers1[i] + " " );
        }
        System.out.println("--------------------------");

        String[] strings = {"10", "9", "90"};   /** Strings sorts in alphabetic order, 1-9, and numbers sorts before letters and uppercase before lowercase; */
        Arrays.sort( strings )
        ;
        for(String string: strings)
            System.out.println(string + " ");

        System.out.println("--------------------------");



    }
}