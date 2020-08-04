package chapter4.accesModifiers.privateAcces;

/**
 *
 */
public class PrivateAccessModifier {

    private String noise = "quack";
    private void quack(){
        System.out.println(noise);
    }

    private void makeNoise(){
        quack();
    }

}
