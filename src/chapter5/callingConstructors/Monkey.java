package chapter5.callingConstructors;

/**
 * Created by Loky on 25/08/2020.
 */
public class Monkey extends Chimpazee{
    public Monkey(){

        System.out.println("monkey");

    }

    public static void main(String[] args) {
        new Monkey();
    }
}
