package chapter5.implementingInterfaces.exercicesInterfaces.playSpaceForInterfaces;

/**
 * Class implements interface! It is going in Only one direction!
 */
public class Seal3ConcreateClass extends Seal2A implements HasTail, HasWiskers, Seal, FliesWithTwoWings{

    @Override
    public void walk(){
    }

    @Override
    public void fly(){
        System.out.println("Fly Seal3ConcreateClass");
    }



}
