package chapter4.reviewQuestions.lambdasExpresionsUnderstanding.example1;

/**
 * Created by Loky on 21/08/2020.
 */
public class CheckIfHopper implements CheckTrait{

    public boolean test(Animal a){
        return a.canHop();
    }

}
