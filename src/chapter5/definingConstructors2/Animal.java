package chapter5.definingConstructors2;

/**
 * Created by Loky on 24/08/2020.
 */
public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name){
        super();
        this.age = age;
        this.name= name;

    }

    public Animal(int age){
        super();
        this.age = age;
        this.name = null;
    }
}
