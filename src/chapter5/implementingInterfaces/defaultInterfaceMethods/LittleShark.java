package chapter5.implementingInterfaces.defaultInterfaceMethods;

/**
 * Created by Loky on 30/08/2020.
 */
public abstract class LittleShark implements HasFins {

    public boolean doFinsHaveScales(){   /** the default it is not allowed!
     */
        return true;
    }

}
