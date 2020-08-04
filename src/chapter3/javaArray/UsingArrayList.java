package chapter3.javaArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Loky on 30/07/2020.
 */
public class UsingArrayList { /** Class E: orice clasa ca poate foarte fi fol pt arraylist */

    public static void main(String[]args){
        /**  the method add():  */
        System.out.println("--------------- ADD():------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add( "deli" ); list.add( "rudy" ); list.add( "loki" );
        System.out.println(list);

        ArrayList<Boolean> trueOrFasle = new ArrayList<>();
        trueOrFasle.add( Boolean.TRUE ); trueOrFasle.add( false );

        ArrayList<String> birds = new ArrayList<String>();
        birds.add( "papagal" ); birds.add( "chicken" ); birds.add( 0,"cardinal" );
        birds.add( 1,"blue jay" ); birds.add( 1, "robin"); birds.add(2,"tinny bird");
        birds.add("lazy birdy");
        System.out.println(birds); // card, rob, blue jay, pap, chick

        System.out.println("--------------- REMOVE():-------------------");

        /**  the method remove(): result BOOLEAN cand e indicata variavila, exep: remove("deli") !!!
         * si ne da numele la variabila care e removed atunci cand folosim indexul!  */
        birds.remove( 4 );
        System.out.println(birds);
        System.out.println(birds.add( "poo" ) );  /** wtf? where is poo? result true??? */
        //birds.add( "**poo" ); /** wtf? where is poo? result true??? */
        System.out.println(birds.remove( "poo" ));
        System.out.println(birds);
        System.out.println(birds.remove( 2 ));

        System.out.println("--------------- SET():-----------------------");

        /** the method set() : change one element, without changing the size of the array. doar inlocuieste o vairabila cu cea noua, si pe cea veche o sterge
         * dimensiunea ramane aceeasi */
        ArrayList<Integer> intArray = new ArrayList<>(  );
        intArray.add(0,0);
        intArray.add(1,1);
        intArray.add(2,2);
        intArray.add( 3, 3 );
        intArray.add( 4,4 );
        System.out.println(intArray);
        System.out.println(intArray.size());
        System.out.println(intArray.set( 1,99 ));
        System.out.println(intArray);
        System.out.println(intArray.size());

        System.out.println("--------------- isEmpty() and size() and clear(): ---------------------");
        System.out.println(intArray.isEmpty());
        intArray.clear();   /**sterge totata lista   */
        System.out.println(intArray.isEmpty());
        System.out.println(intArray.size());

        System.out.println("--------------- contains(): -----------------------");
          /** contains() ne da ca rezultat true or false, daca contine ceva ce intrebam noi sau nu     */
          List<String> animals = new ArrayList<String>();
          animals.add( 0,"cat" );
          animals.add( 1, "dog" );
          animals.add( "lion" );                        /** il pune pe ultimul loc */
          System.out.println(animals);
          System.out.println(animals.contains( "lion" ));


        System.out.println("--------------- equals(): ------------------");
        /**verifica daca 2 obiecte sunt identice */

            List<String> one = new ArrayList<>(  );
            List<String> two = new ArrayList<>(  );
        System.out.println(one.equals( two ));
        one.add( "a" );
        System.out.println(one.equals( two ));
        two.add( "a" );
        System.out.println(one.equals( two ));
        one.add( "b" );
        two.add( 0, "b" );
        System.out.println(one.equals( two ));

    }
}
