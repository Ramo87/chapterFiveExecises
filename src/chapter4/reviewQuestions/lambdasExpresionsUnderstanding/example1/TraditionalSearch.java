package chapter4.reviewQuestions.lambdasExpresionsUnderstanding.example1;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Loky on 21/08/2020.
 */
public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add( new Animal("fish", false, true) );
        animals.add( new Animal( "kangoroo", true, false ) );
        animals.add(new Animal( "turtle", false, true ));

        print(animals, b -> b.canHop());
        print(animals, a -> a.canSwim());
        print(animals, c -> ! c.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal: animals){
            if(checker.test(animal))
                System.out.println(animal + "");
        }
        System.out.println();
    }
}
