package chapter4.accesModifiers.defaultAcces.swan;

import chapter4.accesModifiers.defaultAcces.duck.MotherDuck;


/**
 * Without any acces modifier, default will speak! that means that classes outside the package con not access the methods!
 */
public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        /** duck.quack();  - metoda nu e public si nu o putem fol!
         *         System.out.println(duck.noise) - nu se copileaza;
         */
    }



}
