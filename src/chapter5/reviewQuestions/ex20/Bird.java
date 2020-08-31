package chapter5.reviewQuestions.ex20;

/**
 * Created by Loky on 31/08/2020.
 */
public abstract class Bird {
    private void fly(){
        System.out.println("Bird is flying");
    }

    public Bird get() {
        return null;
    }

    public static void main(String[] args) {  /** funct numai pt ca sunt in acceasi clasa si cheama direct obj bird*/
        Bird bird = new Pelican();
        bird.fly();
    }


}
