package chapter3.javaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayAndList {

    public static void main(String[] args){

                /** 1: Turning an array into an ArrayList:  */

        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("adress");

        Object[] objectArray = list.toArray(); /**shows that an ArrayList knows how to convert itself to an array. But why Object??? */
        System.out.println(objectArray.length);

        String [] stringArray = list.toArray(new String[0]);  /** hier we specifiy the type of the array that does exactly what we want */
        System.out.println(stringArray.length);

                /** 2: Converting from an array into a List:  */
         String[] array = {"hawk", "robin"};
         List<String> list2 = Arrays.asList(array);
        System.out.println(list2.size());
        list2.set( 1, "test" );
        array[0] = "new";
        for(String b: array)
            System.out.println(b+" ");  //new test
        list2.remove( 1 );




    }


}
