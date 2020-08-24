package chapter4.reviewQuestions;

/**
 * Since Java is pass-by-reference, assigning a new object to a does not change the
 caller. Calling append() does affect the caller because both the method parameter and
 caller have a reference to the same object. Finally, returning a value does pass the reference
 to the caller for assignment to s3.
 */
public class Ex17StringBuilder {
    public static StringBuilder work(StringBuilder a, StringBuilder b) {

        a = new StringBuilder( "a" );
        b.append( "b" );
        return a;

    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder( "s1" );
        StringBuilder s2  = new StringBuilder( "s2" );
        StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1 );
        System.out.println("s2 = " + s2 );
        System.out.println("s3 = " + s3 );

    }


}
