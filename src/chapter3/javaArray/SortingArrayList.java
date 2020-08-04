package chapter3.javaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** A collection represents a group of objects, known as its elements.
                                Some collections allow duplicate elements and others do not.
                                Some are ordered and others unordered.     */


public class SortingArrayList {

    private List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

    SortingArrayList sortM = new SortingArrayList();
    sortM.getSorting( 2,1,10,7 );


    }

    public void getSorting(int a, int b, int c, int d){

        SortingArrayList sortA = new SortingArrayList();

        sortA.numbers.add( a );
        sortA.numbers.add( b );
        sortA.numbers.add( c );
        sortA.numbers.add( d );
        System.out.println(sortA.numbers);

        Collections.sort( sortA.numbers );
        System.out.println(sortA.numbers);



    }

}
