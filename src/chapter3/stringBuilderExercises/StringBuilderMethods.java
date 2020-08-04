package chapter3.stringBuilderExercises;

/**
 * Created by Loky on 28/07/2020.
 */
public class StringBuilderMethods {

    StringBuilder sbm = new StringBuilder( "animal" );

    public static void main(String[] args) {

        StringBuilderMethods sb = new StringBuilderMethods();

        System.out.println("1 " + sb.sbm.charAt(1));
        System.out.println("2 " + sb.sbm.indexOf("al"));
        System.out.println("3 " + sb.sbm.length()); //length, size se incepe numerarea de la 1!
        System.out.println("4 " + sb.sbm.substring( 0,3 ));     //ani ?? - face un string, dar nu schimba si valoarea la SB.
        System.out.println("5 " + sb.sbm.append( "You" )); //de ce imi da animalYou aici?? nu trebuia sa fie taiat, sa mearga mai departe doar o parte din string? vezi 4! substring
        System.out.println("6 " + sb.sbm.insert( 3,"/" )); //    ani/malYou
        System.out.println("7 " + sb.sbm.insert(0,"-")); //      -ani/malYou
        System.out.println("8 " + sb.sbm.insert( 11, "!" )); //  -ani/malYou!
        System.out.println("9 " + sb.sbm.delete(0,1 ));              //   ani/malYou!
        System.out.println("10 " + sb.sbm.deleteCharAt( 3 ));        //   animalYou!
        System.out.println("11 " + sb.sbm.reverse());
        System.out.println("11 " + sb.sbm.reverse());
        System.out.println("12 " + sb.sbm.toString());


    }

}
