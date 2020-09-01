package chapter5.reviewQuestionsChapter5.ex17;

/**
 * Created by Loky on 01/09/2020.
 */
public abstract class Whale {

    public abstract void dive();  /**  in carte ex nu se compila din cauza ca la metoda abstracta erau
                                            acoladele de la corpul metodei */

    public static void main(String[] args){
        Whale whale = new Orca();
        //whale.dive; - nici aici nu se compileaza
    }




}
