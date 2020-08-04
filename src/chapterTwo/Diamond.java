package chapterTwo;

import java.util.Scanner;

/**
 * Created by Loky on 26/07/2020.
 */
public class Diamond {


    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter a number: ");
        createDiamont(in.nextInt());
    }

    static void createDiamont(int x) {

        int count = 0;
        for ( ; x > 0; x--) {
            for (int i = 0; i<x-1; i++) {
                System.out.print(" ");
            }
            for (int i = x - 1; i <x + count * 2; i ++) {
                System.out.print("*");
            }
            for (int i = x; i < (2 * x) - 1; i++) {
                System.out.print(" ");
            }
            System.out.println();
            count++;
        }
    }

}
