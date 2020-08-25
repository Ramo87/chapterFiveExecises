package chapter5.callingConstructors;

/**
 * Created by Loky on 25/08/2020.
 */
public class Chimpazee extends Ape {

    public Chimpazee(){
    super();
        System.out.println("chimpanzee");
    }
    public static void main(String[] args) {
        new Chimpazee();
    }
}
