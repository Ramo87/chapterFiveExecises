package chapter4.StaticMethodsFields;

/**
 * each time the contrustor is called, it increments by 1;
 *
 */
public class Counter {

    private int instanceCount;
    private static int classCount;
    public Counter(){
        instanceCount++;
        classCount++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter cc = new Counter();
        System.out.println(cc.instanceCount);
        System.out.println(classCount);
    }
}
