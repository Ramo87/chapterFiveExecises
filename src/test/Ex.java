package test;

/**
 * Created by Loky on 05/07/2020.
 */
public class Ex {
    private int i = 1;
    public static void main(String argv[]) {
        int i = 2;
        Ex s = new Ex();
        s.someMethod();
    }
    public static void someMethod() { //nu poti sa fol un camp de instanta intr-o metoda statica, fara sa ai un obliect deja creat
        System.out.println("i");
    }
}

