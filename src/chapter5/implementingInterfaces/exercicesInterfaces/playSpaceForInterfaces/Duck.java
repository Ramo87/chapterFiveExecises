package chapter5.implementingInterfaces.exercicesInterfaces.playSpaceForInterfaces;

/**
 * Created by Loky on 29/08/2020.
 */
public class Duck implements FliesWithTwoWings, WalksOnTwoLegs {

    @Override
    public void fly() {
        System.out.println("Fly duck!");
    }



    @Override
    public void walk() {
        System.out.println("Walk!");
    }
}
