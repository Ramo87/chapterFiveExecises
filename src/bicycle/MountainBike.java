package bicycle;


/**
 * Created by Ramona on 22/07/2020.
 */

public class MountainBike extends Bicycle {

    public int seatHeight; //the subclass add one more field

    public MountainBike (int gear, int speed, int startHeight) { //the subclass has one constructor
        super(gear, speed); //invoking base class constructor
        seatHeight = startHeight;

    }



    MountainBike () { //asa chemam construcorul din aceeasi clasa
        this(1, 1, 0);
    }

    public void setHeight(int newValue) { //adds one more method
        seatHeight =  newValue;
    }

    public String toString(){
        return (super.toString()+
        "\nseat height is " +seatHeight);

    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("I am Montanbike");
    }
}
