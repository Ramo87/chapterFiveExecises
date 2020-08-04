package chapter3.javaArray;

public class GetArrays {

    private int[] numbers = {1, 6, 5, 8, 9}; /**declare and intizialize an array*/
    private char[] name = new char[6];

    String[] bugs = {"cricket", "beetle", "ladybug"};
    String[] newBugs = bugs;

    public static void main(String []args) {

        GetArrays testArray1 = new GetArrays();

        System.out.println(testArray1.bugs.length); /**lengts incepe mereu de la 1! avem 3 pozitii, length = 3! daca am avea int[6] a =new int[], length ar fi 6. */
        System.out.println(testArray1.bugs[0]);
        System.out.println(testArray1.bugs.toString());

        int[] numAnimals; /**cele 2 partanteza partate pot fi puse sau lipite de numAnimal, si dupa! varinta din fata e cel mai des fol!*/

        int ids[], types; /**se creaza 2 variabile de tip int: un array si o variabila "normala" */
        ids = new int[5]; //nu poti fol: ids = {5}- nu se compileaza, trebuie definit pe ramdul 21, unde avem int ids[];
        ids[0] = 4;

        System.out.println(testArray1.bugs.equals( testArray1.newBugs ));
        System.out.println(testArray1.bugs.toString());

        String[] strings = {"stringValue", "noStringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); - does not compile, cause a String [] only allows a String object, and StringBuilder is not a String;
        objects[0] = new StringBuilder(  ); /** we don t have actually an object, we have a string referred to from an object[] variable. ar run time,
                                            throws an exception. */
        int[] ints = {4,0,3,9,5};

        /**long[] longs = (long[]) ints; - nu merge!!!! sunt primitive si nu avem iheritance **/





    }
}
