package chapter4.overloadingMethods;

/**
 * Note that Java can only accept wider types. An int can be passed to a method taking a
 long parameter. Java will not automatically convert to a narrower type. If you want to pass
 a long to a method taking an int parameter, you have to add a cast to explicitly say narrowing
 is okay.
 */
public class PrimitivesPlane {

    public void fly(int i) {
        System.out.println("int ");
    }
    public void fly(long l){
        System.out.println("long");
    }

    public static void main(String[] args) {
        PrimitivesPlane p = new PrimitivesPlane();
        p.fly( 123 );
        p.fly( 123L );
    }
}
