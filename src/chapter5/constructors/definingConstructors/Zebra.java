package chapter5.constructors.definingConstructors;

/**
 * Created by Loky on 24/08/2020.
 */
public class Zebra extends Animal{
    public Zebra(int age){
        super(4);
    }

    public Zebra(){
        super(5); //aici chemam constructorul clasei superioare dar merge sa fol si this si super.
    }


}
