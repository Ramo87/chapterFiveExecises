package chapter5.reviewQuestionsChapter5.ex18;

/**
 * Created by Loky on 01/09/2020.
 */
public class ClownFish implements Aquatic{
    public String getNumberOfGills() {
        return "4";
    }
    public int getNumberOfGills(int input){  /** in carte: la return type e String si nu se compileaza ca metoada este overriden
                                                iar return type trebuie sa sie accelasi tip sau covariant*/
        return 3;
    }

    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumberOfGills(-1));
    }
}
