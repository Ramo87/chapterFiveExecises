package classInheritanceTwo;

/**
 * Created by Loky on 05/07/2020.
 */
public class Main3 {
    public static void main(String[] args) {
        Entity entity = new Entity();
        Entity entity1 = new Animal();
        Entity entity2 = new SeaLion();
        Entity entity3 = new Lion();
        Entity entity4 = new Lion( 10 );

        System.out.println(entity3);
        System.out.println(entity4);

    }
}
