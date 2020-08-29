package chapter5.inheritingVariables_hindingVariables;



/**
 * Java does not allow variables to be overridden, but instead hidden!
 * We hide a variable when we we use a variable with the same name as the variable in the parent class;
 */
public class Rodent1{
    protected int tailLength =4;
    public int length = 5;

    public void getRodentDetails() {
        System.out.println("[parentTail=" + tailLength + "]" );
    }


}
