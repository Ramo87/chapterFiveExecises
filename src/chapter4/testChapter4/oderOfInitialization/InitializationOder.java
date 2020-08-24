package chapter4.testChapter4.oderOfInitialization;

/**
 * Created by Loky on 07/08/2020.
 */
public class InitializationOder {

    private String name = "Deli";
    {
        System.out.println(name);
    }
    private static int count = 0;
    static {
        System.out.println(count);
    }

    {
        count++;
        System.out.println(count);
    }
    public InitializationOder(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOder();
    }

}
