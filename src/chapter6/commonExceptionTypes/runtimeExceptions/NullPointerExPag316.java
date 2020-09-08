package chapter6.commonExceptionTypes.runtimeExceptions;

/**
 * Created by Loky on 08/09/2020.
 */
public class NullPointerExPag316 {

    static String name;

    public static void printLength() { //throws NullPointerException {

        name.length();

    }

    public static void main(String[] args) {
            try{
                printLength();
            }catch (NullPointerException e){
                System.out.println("we did catch it! a null pointer exception! our name" + name + " has no value!");
            }
            System.out.println(name.length());
    }
}


