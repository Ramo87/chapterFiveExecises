package chapter3.reviewQuestions;

/**
 * Created by Loky on 01/08/2020.
 */
public class Ex1Fish {

    public static void main(String[] args) {

        int numFish = 4;
        String fishType = "tuna";

        /** String isFish = numFish + 1;   - DOES NOT COMPILE! we can store a int in a string variable!!!
        System.out.println(isFish + " " + fishType); */

        String isFish = 2 + "1";
         System.out.println(isFish + " " + fishType);

        System.out.println(numFish + " " + isFish);

    }

}
