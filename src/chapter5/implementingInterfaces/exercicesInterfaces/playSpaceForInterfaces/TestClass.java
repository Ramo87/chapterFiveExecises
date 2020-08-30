package chapter5.implementingInterfaces.exercicesInterfaces.playSpaceForInterfaces;


import java.util.List;

/**
 * Created by Loky on 29/08/2020.
 */
public class TestClass {
    public static void main(String[] args) {
        /**  WalksOnTwoLegs notComplie  =new WalksOnTwoLegs();
         *   - > does not compile because we con not directly instantiate an interface */

        FliesWithTwoWings fliesWithTwoWings = new Duck();
        method( fliesWithTwoWings );

        FliesWithTwoWings fliesWithTwoWings1 = new Seal3ConcreateClass();
        method( fliesWithTwoWings1 );

        Duck duck = new Duck();
        method( duck );
    }

    static void method(FliesWithTwoWings fliesWithTwoWings) {
        fliesWithTwoWings.fly();
    }

    static void method1(List list) {
        list.size();
    }

}
