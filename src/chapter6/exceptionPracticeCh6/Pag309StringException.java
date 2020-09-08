package chapter6.exceptionPracticeCh6;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Loky on 07/09/2020.
 */
public class Pag309StringException {

    public static void main(String[] args) {

        Pag309StringException pag309StringException = new Pag309StringException();

        String s = "";
        try {                      /** un singur catch este citit, cel care se potriveste cel mai bine cu exceptioa */
            s += "a";            /**  clasele din exceptii se scriu in oride crscatoare, adica copilul trebuie sa fie inainte  */
            pag309StringException.m();
            s += "b";
        } catch (FileNotFoundException e) {
            s += "g";
        } catch (RuntimeException e) {
            s += "c";
        } catch (Exception e) {
            s += "d";


        } finally {  /** important despre finallz: se intra mereu in finally, este mereu citit!  */
            s += "e";
            try {
                pag309StringException.m();
            } catch (IOException e) {
                s += "h";
            }
        }
        s += "f";

        System.out.println( s );
    }

    void m() throws IOException {
        int b = 2 / 0;
    }
}
