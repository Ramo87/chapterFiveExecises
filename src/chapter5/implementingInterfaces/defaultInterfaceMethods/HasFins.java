package chapter5.implementingInterfaces.defaultInterfaceMethods;

/**
 * Created by Loky on 30/08/2020.
 */
public interface HasFins {

    public default int getNumberOfFins(){
        return 4;
    }

    public default double getLongestFinLength(){
        return 20.0;
    }
    public default boolean doFinsHaveScales(){
        return true;
    }
}
