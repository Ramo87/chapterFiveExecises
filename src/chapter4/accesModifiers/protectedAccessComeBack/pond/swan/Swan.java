package chapter4.accesModifiers.protectedAccessComeBack.pond.swan;
import chapter4.accesModifiers.protectedAccessComeBack.pond.shore.Bird;

public class Swan extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }
    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);

    }
    public void helpOtherBirdSwim(){
        Bird other = new Bird();

        System.out.println("other.text - it does not compile!");
    }
}
