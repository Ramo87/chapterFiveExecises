package chapter4.constructors.oveloadingConstructors;

/**
 * constructors must have different parameters in order to be overloaded.
 */
public class Hamster {

    private String color;
    private int weight;
    private boolean hasBrain;
    private double thinking;

    public Hamster(int weight){
        this.weight =  weight;
    }

    public Hamster(int weight, String color){
        this(weight);
        this.color = color;
    }
    public Hamster(int weight, double thinking){
        new Hamster("red", weight,  true ); /** asa ceva nu se face! desi se compileza */
    }

    public Hamster(boolean hasBrain) {
        this(2, "blue");
        this.hasBrain = hasBrain;
    }

    public Hamster(String color, int weight, boolean hasBrain) {
        this(weight, color);
        this.hasBrain = hasBrain;
    }


}
