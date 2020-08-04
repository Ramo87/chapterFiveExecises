package chapter4.accesModifiers.defaultAcces.duck;

/**
 * Created by Loky on 04/08/2020.
 */
public class MotherDuck {

    String noise = "quack";
    void quack(){
     System.out.println(noise);
    }

    private void makeNoise(){
    quack();
    }
}