package tutorialConstructor;

/**
 * Created by Loky on 11/07/2020.
 */
public class Main {
    public static void main(String[] tot){
        Shirt s = new Shirt( "White", 'm', 6 );
        Shirt puma = new Shirt( "whiteZI", 'm', 9 );

        s.setColor( "red, even the color is private" );
        s.setSize( 'M' );
        s.putOn();
        s.takeoff();
        puma.setPrice( 89 );

        System.out.println(puma.getColor());
        System.out.println(puma.size);

        System.out.println(puma.getPrice());

        System.out.println(s.getColor());
        System.out.println(s.size);
    }

}
