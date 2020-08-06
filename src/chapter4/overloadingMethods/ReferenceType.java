package chapter4.overloadingMethods;

/**
 * Created by Loky on 05/08/2020.
 */
public class ReferenceType {

    public void fly(String s){
        System.out.println("string");
    }

    public void fly(Object o){
        System.out.println("object");
    }

    public static void main(String[] args) {
        ReferenceType r = new ReferenceType();
        r.fly( "test" ); /** The answer is "string object". The fi rst call is a String and fi nds a direct match.
         There's no reason to use the Object version when there is a nice String parameter list just
         waiting to be called. */

        r.fly( 56 ); /** The second call looks for an int parameter list. When it doesn't fi nd
         one, it autoboxes to Integer. Since it still doesn't fi nd a match, it goes to the Object one. */

    }
}
