package chapter6.exceptionPracticeCh6.excepionEx1;

import static chapter6.exceptionPracticeCh6.excepionEx1.VisitPorcupinePag310.seeAnimal;

/**
 * Created by Loky on 07/09/2020.
 */
public class VisitMonkeys {

    public void visitMonkey() {
        try {
            seeAnimal();   /** if seeAnimal does not throw an exception, noting is printed out */
        } catch (ExibitClosedForLunch e) {   /** subclass exception, child first! */
            System.out.println( "try back later" );
        } catch (ExhibitClosed e) {
            System.out.println( "not today" );  /** superclass exception, then the parents  */
        }
    }
}
