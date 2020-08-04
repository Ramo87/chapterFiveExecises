package classInheritance;

/**
 * Created by Loky on 05/07/2020.
 */
public class Test {
    public static void main(String []args) {
        m();
    }

    static void m() {
        try {
            System.out.println("Start");
            int i = 0;
            if (i == 0) {
                throw new IllegalArgumentException(  );
            }
            System.out.println("After exception throw");
        } catch (RuntimeException e) {
            System.out.println("In catch block");
        }



        System.out.println("End statment");
    }
}
