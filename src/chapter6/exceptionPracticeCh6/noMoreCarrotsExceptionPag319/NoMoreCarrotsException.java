package chapter6.exceptionPracticeCh6.noMoreCarrotsExceptionPag319;

/**
 * Created by Loky on 08/09/2020.
 */
public class NoMoreCarrotsException extends Exception {
}

class Bunny{
    /**  prima varitanta e sa handle the exception:  */
    public static void main(String[] args) {
        try {
            eatCarrots(); /** only eatCarrots(), without try and catch, does not copile because we didn#t declared or handeld the NoMoreCarrotsException  */
        }catch(NoMoreCarrotsException e){
            System.out.println("sad rabitt!");

        }
    }

    private static void eatCarrots() throws NoMoreCarrotsException{  /** it is a checked exception and it needs to be declared or handled */
        /**  in fact, eatCarrots does not thows any Exceptions! */
    }
}

    /**  a doua varitanta e sa decare the exception :
      public static void main(String[] args) throws NoMoreCarrotsException {
     eatCarrots();
     */