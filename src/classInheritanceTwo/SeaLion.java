package classInheritanceTwo;

/**
 * Created by Loky on 05/07/2020.
 */
public class SeaLion extends Animal {
    private int fins = 4;

    public SeaLion() {
        this.fins = 6;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm SeaLion");
    }

    public void swim() {
        System.out.println("I'm a SeaLion, so I like to swim");
    }

    @Override
    public String toString() {
        return "I'm SeaLion and I have " + this.fins + " fins";
    }
}
