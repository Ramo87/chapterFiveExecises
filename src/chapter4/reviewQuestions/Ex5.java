package chapter4.reviewQuestions;

/**
 * Created by Loky on 20/08/2020.
 */
public class Ex5 {

    public static void main(String []args){
        Ex5 z = new Ex5();
        System.out.println(z.howMany(true  ));
        System.out.println(z.howMany(true, true  ));
        System.out.println(z.howMany(true, true, true  ));
        /** System.out.println(z.howMany(true, {true}  ));  ---> Options E and F do not
         compile because they do not declare an array properly.   */
        /** System.out.println(z.howMany(true, {true, true}  ));  --- Options E and F do not
         compile because they do not declare an array properly.  */
        System.out.println(z.howMany(true, new boolean[2]  ));
    }

    public int howMany(boolean b, boolean... b2){
        return b2.length;

    }

}
