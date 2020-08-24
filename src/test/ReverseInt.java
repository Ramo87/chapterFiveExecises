package test;

/**
 * Created by Loky on 19/08/2020.
 */
public class ReverseInt {

    public static void main(String[] args){
       ReverseInt tryTest = new ReverseInt();
        tryTest.reverseInt(45676);



    }

    public void reverseInt(int a){
        String b = Integer.toString( a );
        StringBuilder c = new StringBuilder(b);
        c.reverse();
        ///int aa = Integer.parseInt(c);
        System.out.println(Integer.valueOf(c.toString()));



    }

}
