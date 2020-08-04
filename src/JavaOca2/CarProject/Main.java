package JavaOca2.CarProject;

/**
 * Created by Loky on 08/07/2020.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car( "Audi", 4 );
        System.out.println(car.getCylindres());

        Car carZ = new Car("Prototype Car", 10);
        System.out.println(carZ.startEngine());
        System.out.println(carZ.getCylindres());
        System.out.println(carZ.accelerate());
        System.out.println(carZ.brake());

        Audi Audi = new Audi("Audi4", 39);
        System.out.println(Audi.startEngine());
        System.out.println(Audi.accelerate());
        System.out.println(Audi.brake());

        Ford Ford2 = new Ford("FordIdy", 21);
        System.out.println(Ford2.startEngine());
        System.out.println(Ford2.accelerate());
        System.out.println(Ford2.brake());

        Mitsubishi Mitsubishi23 = new Mitsubishi( "MitsubishiAsia", 56 );
        System.out.println(Mitsubishi23.startEngine());
        System.out.println(Mitsubishi23.accelerate());
        System.out.println(Mitsubishi23.brake());

    }

}
