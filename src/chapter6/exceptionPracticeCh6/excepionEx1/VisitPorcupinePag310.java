package chapter6.exceptionPracticeCh6.excepionEx1;

/**
 * Created by Loky on 07/09/2020.
 */
public class VisitPorcupinePag310 {

    public static void visitPorcupine(){
        try{
            seeAnimal();

        }catch (AnimalOutForWalk e){
            System.out.println("try back later");
        }catch (ExhibitClosed e){
            System.out.println("not today");
        }



    }

    public static void main(String[] args) {
        VisitPorcupinePag310 porcupine = new VisitPorcupinePag310();
        porcupine.visitPorcupine();
    }

    static void seeAnimal(){

    }
}
