package chapter1.reviewQuestion;

public class Question3 {

    short numPets = 5;
    //int numGrains = 5.6; - nu se compileaza ca 5.6 nu e int
    String name = "Deli";

    public static void main(String[] m) {

        Question3 five = new Question3();

        //System.out.println(five.numPets.lenght()); short nu are metoda length
        //System.out.println(five.numGrains.lenght()); //int nu are metoda length
        System.out.println(five.name.length());


    }

}
