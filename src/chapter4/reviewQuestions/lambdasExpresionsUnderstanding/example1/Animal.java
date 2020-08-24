package chapter4.reviewQuestions.lambdasExpresionsUnderstanding.example1;


public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        this.species = speciesName;
        canHop = hopper;
        canSwim = swimmer;

    }

    public boolean canHop(){
        return canHop;

    }

    public boolean canSwim(){
        return canSwim;
    }

    @Override   //from java.lang
    public String toString(){
        return species;
    }
}
