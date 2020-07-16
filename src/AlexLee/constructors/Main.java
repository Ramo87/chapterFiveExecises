package AlexLee.constructors;

import AlexLee.constructorsTwo.AddidasShirt;
import AlexLee.constructorsTwo.PumaShirt;

/**
 * Created by Loky on 11/07/2020.
 */
public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Shirt shirt = new AddidasShirt();
        shirt.setColor( "red" );
        shirt.setSize( 's' );
        shop.addShirt( shirt );
        shirt = new AddidasShirt( "blue", 'm' );
        shop.addShirt( shirt );
        Shirt shirt1 = new PumaShirt( "yellow", 'l');
        shop.addShirt( shirt1 );

        Shirt shirt2 = new AddidasShirt( "blue", 'm' );
        shop.tryShirt( shirt2 );
    }


}
