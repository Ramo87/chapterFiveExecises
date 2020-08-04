package chapter4.StaticMethodsFields;

/**  The static initializer runs when the class is fi rst used.
 *   The statements in it run and assign any static variables as needed.
 *
 *  */


public class StaticInitializationComeBack {

    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
    private static int one;   /** declares a static variable that is not final */
    private static final int two;   /**    declares a final variable without initializint it, and it can be initialize in a static block; */
    private static final int three = 3;    /** */
        //private static final int four; // DOES NOT COMPILE
        static {
        one = 1;
        two = 2;
        //three = 3; // DOES NOT COMPILE because we are not allowed to assign is twice
        //two = 4; // DOES NOT COMPILE - WHY NOT ???????

}
}

