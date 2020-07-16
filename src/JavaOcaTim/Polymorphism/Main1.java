package JavaOcaTim.Polymorphism;

/**
 * Created by Loky on 14/07/2020.
 */
public class Main1 {

    public static void main(String[]args) {

        for(int i = 1; i<11; i++) {
            Movie movie = Main.randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() +"\n" + "Plot: " + movie.plot() + "\n");
        }
    }


/** JavaOcaTim.Polymorphism = we assign different functionality -s, depending on the type of object that we have created.
 *
 *  All this objects are inherited from the base movie class, BUT also, we assigned a unique bit of functionality in each of those plot methods,
 *  for each of those classes.
 *
 *
 *
 **/

}
