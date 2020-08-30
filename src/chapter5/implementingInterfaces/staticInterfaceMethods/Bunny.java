package chapter5.implementingInterfaces.staticInterfaceMethods;

/**
 * Created by Loky on 30/08/2020.
 */
public class Bunny implements Hop, Breath{
    public void printDetails(){
        System.out.println(Hop.getJumpHeight());  /**  */
        System.out.println(Breath.breath());
    }

   /** we acces the static methods only with the name of the class! no inheritance posible, or ovverride! */



}
