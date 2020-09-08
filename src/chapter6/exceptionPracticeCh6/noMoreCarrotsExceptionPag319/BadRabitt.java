package chapter6.exceptionPracticeCh6.noMoreCarrotsExceptionPag319;


/**
 *
 */
public class BadRabitt {

    public void bad(){
//        try{
//            eatCarrot();
//        }catch(NoMoreCarrotsException e){ // does not compile
//            System.out.println("sad rabitt!");
//        }
    }

    public void good() throws NoMoreCarrotsException{
        eatCarrot();
    }

    private static void eatCarrot(){

    }
}
