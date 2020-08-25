package chapter5.callingInheritedClassMembers;

/**
 * with "this" we can also access the member of the parent class, since a child class inherits all of the members of the
 * parent class.
 * this and super can be used to acces members of the partent class!
 * To access member from the same class, we use only this.
 */
public class Shark extends Fish {

    private int numberOfFins =8;

    public Shark(int age){
        super(age);
        this.size = 4;

    }

    public void displaySharkDetails(){
        System.out.println("Shark with age: " + this.getAge());

        System.out.println(" and " + super.size + "members lang"+ super.getAge()); //we can use super and this!
        System.out.println("with " + this.numberOfFins + "fins"); //we can use only this, since numberOfFins are find only in Shark class
    }
}
