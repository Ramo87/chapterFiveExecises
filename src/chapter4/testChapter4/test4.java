package chapter4.testChapter4;

public class test4 extends Classroom {


    test4(int r, String t) {
        super( r, t );
    }

    public static void main(String[] args) {


        Classroom Info = new Classroom( 45, "java" );

        System.out.println( howMany( true ) );
        System.out.println( howMany( true, new boolean[2]));
        System.out.println();
    }


    public static int howMany(boolean b, boolean... b2) {
        System.out.println( b );
        for (int i = 0; i < b2.length; i++) {
            System.out.println( b2[i] );
        }
        return b2.length;
    }
}




