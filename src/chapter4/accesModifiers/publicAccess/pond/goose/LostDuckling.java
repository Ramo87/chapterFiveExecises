package chapter4.accesModifiers.publicAccess.pond.goose;
import chapter4.accesModifiers.publicAccess.pond.duck.DuckTeacher;

/**
 * Created by Loky on 04/08/2020.
 */
public class LostDuckling {
    public void swim(){
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("thanks" +teacher.name);
        System.out.println("age" + teacher.age);


    }
}
