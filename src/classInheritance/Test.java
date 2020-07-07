package classInheritance;

/**
 * Created by Loky on 05/07/2020.
 */
public class Test {
    public static void main(String []args) {
        Lion lion = new Lion("King", 2, 56, "black");
        System.out.println(lion.toString());
        lion.setColor("white");
        Lion lion2 = new Lion("King2", 3, 33, "black");
        System.out.println(lion2.toString());
    }
}
