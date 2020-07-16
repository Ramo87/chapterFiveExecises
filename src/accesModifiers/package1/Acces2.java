package accesModifiers.package1;

/**
 * Created by Loky on 13/07/2020.
 */
public class Acces2 {
    public static void main(String[] args){
        Acces1 a = new Acces1();
        System.out.println((a.minutes));
        System.out.println((a.hours));

        a.method1().method2().method3();
    }

}
