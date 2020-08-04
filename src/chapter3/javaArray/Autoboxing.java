package chapter3.javaArray;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {  /** I still don t get it!  */
    /**
     * Casting vs Autoboxing;
     * Casting is connected with Inheritance;
     *
     * Autoboxing = when you type the primitive value and Java convert it to the relevant wrapper class;
     *
     */
    private List<Double> weights = new ArrayList<>();   //variabila de instanta, are nevoie sa fie instatiata nu e statica.

    public static void main(String[] args) {

        Autoboxing a = new Autoboxing();
        double first;
        System.out.println( a.weights.add( 50.5 ) );
        System.out.println( a.weights.add( new Double( 60 ) ) );
        System.out.println( a.weights );
        System.out.println( a.weights.remove( 50.5 ) );
        System.out.println( a.weights );
        System.out.println( first = a.weights.get( 0 ) );

        System.out.println( "-----------------------------------------");

        List<Integer> heights = new ArrayList<>(  );
        heights.add( null );
        System.out.println(heights);
        /** int h = heights.get( 0 );  /** Exception in thread "main" java.lang.NullPointerException
         *   !! BE carfull when you see null in relationship with autoboxing!    !!
         */


        System.out.println( "-----------------------------------------");

        List<Integer> numbers = new ArrayList<>(  );
        numbers.add( 1 );
        numbers.add( 2 );
        numbers.remove( 1 );
        System.out.println(numbers);
        numbers.add( 2 );
        System.out.println(numbers);
        numbers.remove(new Integer(2));
        System.out.println(numbers);
    }
}
