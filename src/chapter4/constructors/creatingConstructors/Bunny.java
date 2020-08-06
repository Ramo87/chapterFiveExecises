package chapter4.constructors.creatingConstructors;

/**
 * Created by Loky on 05/08/2020.
 */
public class Bunny {
    private String color;
    private int height;
    private int length;
    public Bunny(int theHeight, int length){
        length = this.length;  /** for the exam! it is not good!!!! */
        height = theHeight; /** Line 7 is more straightforward. The parameter theHeight and
                            instance variable height have different names. Since there is no naming collision, this is
                            not required. */
        this.color = "white"; /** fine, but redundant */
    }

    public static void main(String[] args) {
        Bunny b = new Bunny( 1,2 );
        System.out.println(b.length+"" + b.height + " " + b.color);
    }

}
