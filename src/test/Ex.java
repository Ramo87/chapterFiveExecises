package test;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

/**
 * Created by Loky on 05/07/2020.
 */
public class Ex {


    private int i = 1;

    public static void main(String argv[]) throws IOException {
        int i = 2;
        Ex s = new Ex();
        s.someMethod();

        File file;
        java.util.logging.FileHandler x;


        File logDirPath = new File( "logs" );

        if (!logDirPath.exists()) {
            logDirPath.mkdir();
            }else if(!logDirPath.isDirectory())
            {
            logDirPath.mkdir();
            }
    }

    public static void someMethod() { //nu poti sa fol un camp de instanta intr-o metoda statica, fara sa ai un obliect deja creat
        //System.out.println(i);
    }
}

