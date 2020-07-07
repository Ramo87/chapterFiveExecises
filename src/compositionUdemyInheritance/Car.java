package compositionUdemyInheritance;

/**
 * Created by Loky on 07/07/2020.
 */
public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super( name );
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
