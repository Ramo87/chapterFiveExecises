package chapter3.reviewQuestions;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Loky on 03/08/2020.
 */
public class Ex20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add( "one" );
        list.add( "two" );
            /** !!! list.add(7); - ArrayList list e de tip String, nu il poate primi  pe 7 !!!   */

        for(String s: list)
            System.out.println(s);

    }

}
