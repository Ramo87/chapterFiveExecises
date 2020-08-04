package chapter3.javaArray;


import java.util.ArrayList;
import java.util.List;

public class GetArrayList {

     /**  Just like a StringBuilder, an ArrayList can change his size at the run time, as needed.
      *   Just like an Array, an ArrayList is an ordered list. for sort.(to sort arrays, we have to import java.util.arrays)
      *   <> [<> </> generics, with java5, allow us to specity the type of class that the ArrayList will contain! ]
      *       Array List implements a List; with another words, it is a list;
      *
      * */

     ArrayList<String> list1 = new ArrayList<>();
    ArrayList list2 = new ArrayList(10);
    ArrayList list3 = new ArrayList(list2);    /** we copied the list2   */

    List<String> list6 = new ArrayList<String>();






}
