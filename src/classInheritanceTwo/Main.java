package classInheritanceTwo;

/**
 * Created by Loky on 05/07/2020.
 */
public class Main {
    public static void main(String[] args) {
        Object o1 = new SeaLion();
        o1.toString();

        Entity seaLion1 = new SeaLion();
        seaLion1.toString();
        seaLion1.whoAreYou();

        Animal seaLion2 = new SeaLion();
        seaLion2.toString();
        seaLion2.whoAreYou();
        seaLion2.play();

        SeaLion seaLion3 = new SeaLion();
        seaLion3.toString();
        seaLion3.whoAreYou();
        seaLion3.play();
        seaLion3.swim();


//
//        Object o2 = new Lion();
//        Object o3 = new Entity();
//        Object o4 = new Animal();
//
////        Entity nop = new Object();
//
//        Entity entity = new Entity();
//        Entity animal = new Animal();
//
//        Entity lion1 = new Lion();
//        Animal lion2 = new Lion();
//        Lion lion3 = new Lion();
//
////        Lion notWorking = new SeaLion();
////        SeaLion alsoNotWorking = new Lion();
    }
}
