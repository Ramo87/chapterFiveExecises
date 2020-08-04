package chapter3.stringBuilderExercises;

/**
 * Created by Loky on 29/07/2020.
 */
public class EqualitySb {

    StringBuilder sb1 = new StringBuilder( "b" ); // wir benutzten new, dann haben wir 2 new objects.
    StringBuilder sb2 = new StringBuilder( "b" );
    StringBuilder sb3 = sb1.append( "a" );

    String x = "Hello World";     // x==y -> true, cause String Pool is uses; and JVM reuses String literals;
    String y = "Hello World";     // BUT: String Pool works only at compile time, NOT at run time.
    String z = " Hello World".trim();

    public static void main(String[] args) {

        EqualitySb a = new EqualitySb();

        System.out.println( a.sb1 == a.sb2 );
        System.out.println( a.sb1 == a.sb3 );
        System.out.println( "---------------------------------------------" );
        System.out.println( a.x == a.y );
        System.out.println( "Este fals pentru ca String Pool nu funtioneaza si la run time :" + a.x == a.y + "!x and z are not the same. z is computet an rund time!" );
        System.out.println(a.x.equals( a.z )); //it is true cause it cheks the value inside of the String!
    }

}
