package chapter6.exceptionPracticeCh6;

/**
 * Created by Loky on 08/09/2020.
 */
public class Pag313StringException {


    public static void main(String[] args) {
        Pag313StringException pag313 = new Pag313StringException();
        pag313.exception();

    }

    public String exception() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();           /** this line throws an NullPointerException   */
                result += "after";       /**  this one is skiped and java jumps to the catch block    */
            } catch (NullPointerException e) {  /**  catches the exception and the resolut is added in the next line    */
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }

        } catch (Exception e) {
            result += "done";
        }
        System.out.println(result);
        return result;

    }
}