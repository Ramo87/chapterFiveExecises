package chapter5.reviewQuestionsChapter5.ex17;

/**
 * Created by Loky on 01/09/2020.
 */
public class Orca extends Whale {

    public void dive(){                   /**  in carte tot nu se compileaza din cauza ca metoda abstracta din clasa abstracta
                                                      nu este override ci overloded; [metoda dive primese paramentru int depth in Orca]
                                                iar public class Orca extends Whale nu se compileaza*/
        System.out.println("Orca diving");
    }

}
