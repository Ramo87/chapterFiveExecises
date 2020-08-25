package chapter5.callingInheritedClassMembers;

/**
 * a private member can be accessed indirectly va a public or protected method.
 * when we override a method, this and super have different effects!
 */
public class Fish  {
    protected int size;
    private int age;

    public Fish(int age) {

        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
