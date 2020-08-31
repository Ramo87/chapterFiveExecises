package chapter5.understandingPolymorphism.virtualMethods;

/**
 * Created by Loky on 30/08/2020.
 */
public class Bird {

    public String getName(){
        return "Unknown";
    }

    public void displayInformation(){
        System.out.println("The bird name is : " + getName());
    }
}
