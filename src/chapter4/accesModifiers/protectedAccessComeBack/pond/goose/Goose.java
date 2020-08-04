package chapter4.accesModifiers.protectedAccessComeBack.pond.goose;

import chapter4.accesModifiers.protectedAccessComeBack.pond.shore.Bird;

/**
 * Created by Loky on 04/08/2020.
 */
public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim(){
        Bird other = new Goose();
        //other.floatInWater();              - Does not compile!  --
        // System.out.println(other.text);   - Does not compile!  -- nu inteleg exact de ce nu merge; pag 179
    }

}
