package chapter4.overloadingMethods;
/**
 * Method overloading occurs when there are different method signatures with the same name but different type parameters.
 */
public class OverloadingMethods {

    /** valid oveloaded methods:  */
    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

    /** public void fly(int numMiles) { }
    public int fly(int numMiles) { } // DOES NOT COMPILE  - This method doesn’t compile because it only differs
     from the original by return type.
     */

    /** public void fly(int numMiles) { }
    public static void fly(int numMiles) { } // DOES NOT COMPILE -->  Again, the parameter list is the same.
     The only difference is that one is an instance method and one is a static method. */
}
