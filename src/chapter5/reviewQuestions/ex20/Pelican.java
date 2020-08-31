package chapter5.reviewQuestions.ex20;

/**
 * Created by Loky on 31/08/2020.
 */
public class Pelican extends Bird {

    protected void play(){
        System.out.println("Pelican is flying");
    }

    @Override
    public Pelican get() {
        return null;

    }
}
