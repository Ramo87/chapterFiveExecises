package abstraction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Loky on 06/07/2020.
 */
public class Main {

    public static void countElementsFromList(List list) {
        List list1 = new MyCustomList();
        System.out.println(list1.size());
        System.out.println(list.size());
    }

    public static void main(String[] args) {

        List list = new ArrayList(  );
        List list1 = new LinkedList(  );

        countElementsFromList( list );
        countElementsFromList( list1 );

        Human human = new Human(2) {
            @Override
            public void talk() {
                System.out.println("I am a method in a that is now an anonymous class");
            }

            @Override
            public void generateEnergy() {

            }
        };

        Human anotherHuman = new Human(3) {
            @Override
            public void talk() {
                System.out.println("I am a method in a that is now another anonymous class");
            }

            @Override
            public void generateEnergy() {

            }
        };

        Vet vet = new Vet() {
            @Override
            public void talk() {
                super.talk();
            }
        };
        vet.talk();

    }
}
