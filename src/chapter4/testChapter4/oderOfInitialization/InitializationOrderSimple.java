package chapter4.testChapter4.oderOfInitialization;

/** you do need to know this Initialization-order by heart:
 *
 1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
 now, just say “no superclass” and go on to the next rule.)
 2. Static variable declarations and static initializers in the order they appear in the file.
 3. Instance variable declarations and instance initializers in the order they appear in the file.
 4. The constructor.
 Let’s try the fi rst example:
 *
 */
public class InitializationOrderSimple {

    private String name = "Deli";
    {
        System.out.println(name);
    }
    private static int count = 0;
    static{
        System.out.println(count);
    }
    static{count +=10;
        System.out.println(count);}
    public InitializationOrderSimple(){
        System.out.println("constructor");
    }
}
