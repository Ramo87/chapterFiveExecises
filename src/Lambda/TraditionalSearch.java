package Lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args){
        List<Animal> animal = new ArrayList<Animal> ();                             //list of animals
        animal.add(new Animal("fish", false, true));      // instantiam clasa animal, am crea o instanta din clasa, un obiect din casa. e calesi lucru
        animal.add(new Animal("kangoroo", true, false));
        animal.add(new Animal("rabbit", true, false));
        animal.add(new Animal("turtle", false, true));

        print(animal, new CheckIfHopper());       //can be replaced with: //print(animals, a -> a.canHop());       //pass class that does check
    }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for(Animal animal : animals) {
            if(checker.test(animal))                                                  //the general check
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}
