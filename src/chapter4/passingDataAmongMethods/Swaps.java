package chapter4.passingDataAmongMethods;

/**
 * Created by Loky on 05/08/2020.
 */
public class Swaps {
    public static void main(String[] args) {

        int or1 = 1;
        int or2 = 2;

        swap( or1, or2 );
        System.out.println( or1 );
        System.out.println( or2 );
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
