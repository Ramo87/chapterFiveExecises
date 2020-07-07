package definingConstructors;


public class Animal extends Beeings {
    private int age;

    public Animal(int age) {
        super( "Animal", "2", "3", 3 ); //calls the parent contrucotor defined in java.lang.Object, no argumants
    }
}

