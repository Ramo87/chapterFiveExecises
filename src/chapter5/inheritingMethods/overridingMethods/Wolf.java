package chapter5.inheritingMethods.overridingMethods;

/**
 * covariant return type =  if the method return a value, it must be the same or a subclass of the method in the parent clas:
 */
public class Wolf extends Canine1 {

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {

        System.out.println(new Canine1().getAverageWeight()); //50
        System.out.println(new Wolf().getAverageWeight()); //70
    }
}
