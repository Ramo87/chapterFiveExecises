package InheritLee;

/**
 * Created by Loky on 12/07/2020.
 */
public class Main {
    public static void main(String []args){
        Mouse1 m1 = new Mouse1();
        Mouse m2 = new Mause2();

        m1.rightClick();
        System.out.println(m1.equals(m2));

    }
}
