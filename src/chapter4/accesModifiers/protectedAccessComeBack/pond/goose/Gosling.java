package chapter4.accesModifiers.protectedAccessComeBack.pond.goose;
import chapter4.accesModifiers.protectedAccessComeBack.pond.shore.Bird;


/**
 * Created by Loky on 04/08/2020.
 */
public class Gosling extends Bird {   /** the child class Bird has access to any protected and public members of the parent class */
    public void swim(){
        //floatInWater();
        System.out.println(text);
    }
}
