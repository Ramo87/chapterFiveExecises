package accesModifiers.package1;

/**
 * Created by Loky on 13/07/2020.
 */
public class Acces1 {

    //default, public, private, protected;

    int hours = 3;
    int minutes = 47;

    public Acces1 method1() {
        System.out.println("method1");
        return this;
    }


    public Acces1 method2() {
        System.out.println("method2");
        return this;
    }


    public Acces1 method3() {
        System.out.println("method3");
        return this;
    }
}
