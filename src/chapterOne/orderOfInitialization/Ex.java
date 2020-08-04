package chapterOne.orderOfInitialization;

/**
 * Created by Loky on 21/07/2020.
 */
public class Ex {
    Integer d = null; // avem o variabila de instanta. variabila de clasa are static in fata!

    public static void main(String argv[]) {
        Ex e = new Ex();
        String s1 = null;
        String s2 = " ";
        String s3 = "";
        System.out.println( s2.isEmpty() );
        System.out.println( s3.isEmpty() );
        System.out.println( e.d );
    }

    {
        System.out.println( "Snowy" ); //este printat primul!!! in fuctie de locul unde se afla noul obiect de tip Ex in MAIN.
    }
}

