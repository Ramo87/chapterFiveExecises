package chapter4.accesModifiers.protectedAccessComeBack.pond.inland;
import chapter4.accesModifiers.protectedAccessComeBack.pond.shore.Bird;
/**
 * Created by Loky on 04/08/2020.
 */
public class BirdWatchingFromAfar {

    public void watchBird(){
        Bird bird = new Bird();
          /** bird.floatInWather();  IT does not complie!!!!!    */
        /** System.out.println(bird.text);   it does not compilde!!!!!!!          */
    }



}
