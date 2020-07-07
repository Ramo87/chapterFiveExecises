package abstraction;

/**
 * Created by Loky on 06/07/2020.
 */
public abstract class Human extends Entity {

    //Normal field in an abstract class
    private int age;

    public Human() {
    }

    public Human(int age) {
        this.age = age;
    }

    public void walk() {
        System.out.println("I am a normal method in an abstract class");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method
    public abstract void talk();
}
