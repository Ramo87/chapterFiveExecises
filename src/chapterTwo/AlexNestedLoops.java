package chapterTwo;

/**
 * Created by Loky on 23/07/2020.
 */
public class AlexNestedLoops { //de intrebat pe alex

    public static void main(String[] m) {


//        int[] ints = {2, 3, 4, 5};
//        for (int i : ints) { // for each - renunta la controlul asupra indexului, pentru o scriere a loopului mai prietenoasa. Ne ajuta cand ne intereseaza o citire completa a sirului.
//            System.out.println(i + "\t" );
//        }
//
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {3, 9, 9}, {5, 7, 12, 7, 8}};

        for (int[] mySimpleArray : myComplexArray) {
//            for (int aMySimpleArray : mySimpleArray) {
//                System.out.println( aMySimpleArray + "\t" );
//            }
//            System.out.println();

            int x = 20;
            while (x > 0) {
                do {
                    x -= 2;
                } while (x > 5);
                x--;
                System.out.println( x + "\t" );
            }
        }
//
//         byte i = 5;
//        byte u = 10;
//        long z = i + u;

//        Customer[] customers = {new Customer( 22, "Alex" ), new Customer( 24, "Ramona" )};
//
//        for (Customer customer : customers) {
//            System.out.println("Age: " + customer.getAge() + ", name: " + customer.getName());
//        }
//
//        for (int i = 0; i<customers.length; i++) {
//            System.out.println("Age: " + customers[i].getAge() + ", name: " + customers[i].getName());
//        }
    }

}
