package chapter3.datesAndTimesComeBack;

import java.time.LocalDate;

/**
 * Created by Loky on 03/08/2020.
 */
public class WorkingWithPeriods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020,8,1);
        LocalDate end = LocalDate.of( 2020,8,5 );
        performAnimalEbrichment(start, end);




    }

    private static void performAnimalEbrichment(LocalDate start, LocalDate en) {
        LocalDate upTo =  start;
        while(upTo.isBefore( en )){
            System.out.println("give new toy: " +upTo);
            upTo = upTo.plusDays( 1 );

        }
    }
}
