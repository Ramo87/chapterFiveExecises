package classInheritanceTwo;

/**
 * Created by Loky on 05/07/2020.
 */
public class Animal extends Entity {
    private int age = 4;

    @Override
    public void whoAreYou() {
        System.out.println("I'm Animal");
    }

    @Override
    public void play() {
        System.out.println("I'm an Animal, so I like to play");
    }

    @Override
    public String toString() {
        return this.age + "";
    }
}
