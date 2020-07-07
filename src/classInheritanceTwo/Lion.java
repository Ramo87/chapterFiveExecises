package classInheritanceTwo;

/**
 * Created by Loky on 05/07/2020.
 */
public class Lion extends Animal {
    private int claws = 20;

    public Lion() {
        this(12); // cheama un constructor din acceasi clasa, care sa ia un parametru
        this.claws = 15;
    }

    public Lion(int claws) {
        super();
        this.claws = claws;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm Lion");
    }

    @Override
    public String toString() {
        return "I'm Lion. And I have " + this.claws + " claws";
    }
}


