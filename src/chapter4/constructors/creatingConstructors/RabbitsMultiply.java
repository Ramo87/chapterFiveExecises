package chapter4.constructors.creatingConstructors;

/**
 * Created by Loky on 06/08/2020.
 */
public class RabbitsMultiply {


        public static void main(String[] args) {

            Rabbit1 r1 = new Rabbit1();
            Rabbit2 r2 = new Rabbit2();
            Rabbit3 r3 = new Rabbit3( true );
            // Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE pt ca este privat
        }

}
