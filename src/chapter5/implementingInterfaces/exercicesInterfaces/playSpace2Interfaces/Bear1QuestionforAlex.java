package chapter5.implementingInterfaces.exercicesInterfaces.playSpace2Interfaces;

/**
 * Created by Loky on 30/08/2020.
 */
public class Bear1QuestionforAlex implements Herbivore, Omnivore {

    public void eatPlants(){
        System.out.println("eat Plants!");
    }
    public void eatMeat(){
        System.out.println("eat Meat!");
    }

    public void eatPlants(int number){
        System.out.println("o metoda cu parametrii diferiti fata de etaPlants e acceptata! return type diferit nu e acceptata in schimb");
    }

    /** public String eatPlants(){    - DOES NOT COMPLIE conflicting interfaces! ???
        System.out.println("the second method with return type string has to be implented, even if the have name");
        return null;
    } */

}
