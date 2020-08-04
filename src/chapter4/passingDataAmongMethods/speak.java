package chapter4.passingDataAmongMethods;

/**
 * Created by Loky on 04/08/2020.
 */
public class speak {

    public static void main(String [] args){
        String name = "webby";
        speak( name );
        name = "alex";
        speak(name);
        System.out.println(name);

    }

    public static void speak(String a){
        a = "sparky";  /** The variable assignment is
                                 only to the method parameter and doesn’t affect the caller. */
    }

}
