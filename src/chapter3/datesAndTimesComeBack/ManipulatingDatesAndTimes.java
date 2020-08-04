package chapter3.datesAndTimesComeBack;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 */
public class ManipulatingDatesAndTimes {
    /**
     * THE DATE AND TIME CLASSES ARE IMMUTABLE !!! just like the Strings!!!
     */

    public static void main(String[] args){

        LocalDate date = LocalDate.of( 2014, Month.JANUARY, 20 );
        System.out.println(date);

        date = date.plusDays( 2 );
        System.out.println(date);

        date = date.plusWeeks( 1 );
        System.out.println(date);

        date = date.plusMonths( 1 );
        System.out.println(date);




    }

}
