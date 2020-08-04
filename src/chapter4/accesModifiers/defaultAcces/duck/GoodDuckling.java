package chapter4.accesModifiers.defaultAcces.duck;

/**
 * Created by Loky on 04/08/2020.
 */
public class GoodDuckling {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);

    }


}
