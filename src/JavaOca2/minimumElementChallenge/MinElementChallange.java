package JavaOca2.minimumElementChallenge;

import java.util.Scanner;

/**
 * Created by Loky on 08/09/2020.
 */
public class MinElementChallange {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Enter count:");
            int count = scanner.nextInt();
            scanner.nextLine();

            int[] returnedArray = readIntegers(count);
            int returnedMin = findMin(returnedArray);

            System.out.println("min = " + returnedMin);

        }

    private static int[] readIntegers(int count) {

            int[] array = new int[count];

            for(int i = 0; i<array.length; i++) {
                System.out.println("Enter a number:");
                int number = scanner.nextInt();
                scanner.nextLine();
                array[i] = number;
            }
            return array;
        }

    //    public static int findMin(int[] newArray){
//        int i;
//        for(i=0; i<=newArray.length; i++){
//            if(newArray[i]<newArray[i+1]){
//                return newArray[i];
//            }
//        }
//      return newArray[i];
//    }

    private static int findMin(int[] array) {

            int min = Integer.MAX_VALUE;

            for(int i=0; i<array.length; i++) {
                int value = array[i];

                if(value < min) {
                    min = value;
                }
            }

            return min;
        }
    }


//    public static int[] readIntegers(int count){
//        Scanner scanner = new Scanner(System.in);
//
//        int[] newArray = {};
//        for(int i = 0; i<=newArray.length; i++) {
//            count++;
//            count = scanner.nextInt();
//        }
//
//        return newArray;
//    }
//

//
//    public static void main(String[] args){
//        readIntegers( 10 );
//
//
//    }

