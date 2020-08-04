package understandException;

import java.util.Scanner;

/**
 * Created by Loky on 16/07/2020.
 */
public class Zoo {
    public static void main(String[] main) {
        String[] anotherArray = new String[10];

        System.out.println( "Please enter the ten names: " );
        try (Scanner unserInput = new Scanner( System.in )) {
            for (int i = 0; i < anotherArray.length; i++) {
                System.out.println( i + ":  " );
                System.out.flush();

                anotherArray[i] = unserInput.nextLine();
            }
            for (String name : anotherArray) {
                System.out.println( name.toUpperCase() );
            }
        }
    }
}

//  for (int i = 0; i < anotherArray.length; i++) {
        //if(anotherArray[i].equals("rudi")){
    //system.out.println("in our list there is a dog with the name rudy!")

//System.out.println("In our list name, " + anotherArray + " you will find, the dog name Rudy!");
//break;
//}else
//System.out.println("Rudy has to be added, he is not in our list");
