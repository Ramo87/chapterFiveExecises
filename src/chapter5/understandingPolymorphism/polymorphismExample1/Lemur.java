package chapter5.understandingPolymorphism.polymorphismExample1;

/**
 * Created by Loky on 14/07/2020.
 */
public class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

//    @Override
//    public boolean hasHair() {
//        return false;
//    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        lemur.hasHair();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println( hasTail.isTailStriped());


        Primate primate = lemur;
        System.out.println( primate.hasHair() );

        Object lemurAsObject = new Lemur();
    }
}
