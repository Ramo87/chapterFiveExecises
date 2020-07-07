package classInheritanceTwo;

/**
 * Created by Loky on 05/07/2020.
 */
public class Main2 {
    public static void main(String[] args) {
        Entity entity = new Entity();
        Entity entity1 = new Animal();
        Entity entity2 = new SeaLion();
        Entity entity3 = new Lion();

//        entity.whoAreYou();
//        entity1.whoAreYou();
//        entity2.whoAreYou();
//        entity3.whoAreYou();

//        callingAnEntity( entity );
//        callingAnEntity( entity1 );
//        callingAnEntity( entity2 );
//        callingAnEntity( entity3 );
//
//        SeaLion seaLion = new SeaLion();
//        Lion lion = new Lion();
//        callingAnEntity( seaLion );
//        callingAnEntity( lion );
        Entity entity4 = new SeaLion();
        entity4.play();
    }

    static void callingAnEntity(Entity entity) {
        entity.whoAreYou();
    }
}
