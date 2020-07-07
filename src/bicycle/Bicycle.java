package bicycle;

/**
 * Created by Loky on 05/07/2020.
 */
public class Bicycle {
    //the class has three fields
    public int gear;     /* gear = vitezele de la masina */
    public int speed;

    //the class has one constructors
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    //the class has three methods
    public void applyBreak(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() { /*print info of the Bicycle */
        return("No of gears are" + gear
        +"\n"
        +"speed of bicycle is" + speed);

    }
}
