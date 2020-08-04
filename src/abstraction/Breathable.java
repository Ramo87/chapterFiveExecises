package abstraction;

/**
 * Created by Ramona on 21/07/2020.
 */
public interface Breathable {

    public static final int numberOfBreaths = 4;

    public void breath();

    public default void defaultMethod() {
        System.out.println("I am a default method in an interface");
    }
}
