package chapter5.implementingInterfaces.defaultInterfaceMethods;

/**
 * Created by Loky on 30/08/2020.
 */
public interface SharkFamily extends HasFins{

    public default int getNumberOfFins(){   /** method override with a new method that return something else */
        return 8;
    }

    public double getLongestFinLength();  /**  replace the default method with an abstract metod, same name, forcing any class
                                                that that implement SharkFamily to provide an implementation for this method!*/

   /**  public boolean doFinsHaveScales(){  /**  overrids the method but does not marks it as default!
        return false;                       - DOES NOT COMPILE! it can not be a method without default with a body!

    */
}
