package chapter3.reviewQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Autoboxing = cand un int e pus in WrapperClass;
 *
 *
 */
public class Ex26ComeBack {

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));  /** aici e autoboxing */
        ages.add(Integer.valueOf("6")); /** aici e autoboxing */
        ages.add(7);    /** aici e autoboxing */
        ages.add(null);
        for(int age : ages)
            System.out.println(age);

    }
}
