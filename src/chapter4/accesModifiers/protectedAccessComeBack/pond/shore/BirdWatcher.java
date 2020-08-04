package chapter4.accesModifiers.protectedAccessComeBack.pond.shore;

/**
 * Created by Loky on 04/08/2020.
 */
public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();              /** calling protected member  */
        System.out.println(bird.text);    /** calling protected member  */
    }

}
