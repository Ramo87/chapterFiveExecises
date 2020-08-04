package chapter3.javaArray;

/**
 * Created by Loky on 30/07/2020.
 */
public class WrapperClasses {

    /** intValue() =
     *  valueOf() = method returns a wrapper class
     *  parseInt() = returns a primitive
     *
     *  * **/

    public static void main(String[]args) {

        int primitive = Integer.parseInt( "0" );
        Integer wrapper = Integer.valueOf( "123" );

        System.out.println(primitive);
        System.out.println(wrapper);

    }
}
