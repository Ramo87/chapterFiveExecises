package chapter5.understandingPolymorphism.virtualMethods;

/**
 * Created by Loky on 30/08/2020.
 */
public class Papagal extends Bird {

    public String getName(){  /** am dat override la metoda getName din Super-clasa Bird;
                                   la runtime, in metoda displayInformation(), metoda e inlocuita cu valoare din clasa papagal   */
        return "Papagal";
    }

    public static void main(String[] args) {
        Bird bird = new Papagal();
        bird.displayInformation();
    }

}
