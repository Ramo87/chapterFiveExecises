package chapter3.stringExercises;

/**
 * Created by Loky on 28/07/2020.
 */
public class UnderstandString {

    public static void main(String[] args) {
    String s ="1";
    s +="2";
    s +="3";
        System.out.println(s);

    String s1 = "1";
    String s2 = s1.concat( "2" );
    s2.concat( "3" ); //string este imutable; aici daca am fi avut s3 = s2.concat("3") --> 123; dar s2 este immutable, si si s1 =1, ramane 1.
        System.out.println(s1);
    }





}
