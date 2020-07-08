package test;

/**
 * Created by Loky on 08/07/2020.
 */
public class Dog {
    public void bark(){
        System.out.println("woof");
    }

    public void bark(int number) {
        for(int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}
