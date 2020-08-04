package chapter4.passingDataAmongMethods;

/** This means that a copy of the variable is made and the
        method receives that copy. Assignments made in the method do not affect the caller.
 */
public class PassByValue {

    public static void main(String[]args) {

        int num = 4;  // num is assigned the value of 4.
        newNumber(5); //we call a method.
        System.out.println(num); /**    The num parameter in the method gets set to 8.
                                        Although this parameter has the same name as the
                            variable on line 3, this is a coincidence. The name could be anything. The exam will often
                            use the same name to try to confuse you. The variable on line 3 never changes because no
                            assignments are made to it. */


    }

    public static void newNumber(int num){
        num = 8;
        System.out.println(num);
    }
}
