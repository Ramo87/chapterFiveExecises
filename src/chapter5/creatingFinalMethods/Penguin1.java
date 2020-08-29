package chapter5.creatingFinalMethods;

/**
 * When to use a final method?
 *  - when we want to gurantee a certain behavior of a method in the parent class;
 *  for example, in a class bird, the method hasFeahters() must allways return TRUE!
 *  there are no birds without feathers;
 */
public class Penguin1 extends Bird {
//    public final boolean hasFeathers(){  - nu poti lua cu override a method that is final!
//        return false;
//    }


}
