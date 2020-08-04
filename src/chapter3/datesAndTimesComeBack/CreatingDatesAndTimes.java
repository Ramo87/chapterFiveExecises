package chapter3.datesAndTimesComeBack;
/**Remember: ! (fara legatura cu subiectul)** we can not use this cu static!!! staic nu se instatiaza */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDatesAndTimes {
    /**
     * 1.  LocalDate => contains just a date; no time, no time zone;
     * => example =' my birthday = is my birthday hole day, no hour no second is relevant;
     * <p>
     * 2.  LocalTime => contains just a time, no date, no time zone. Example: midnight;
     * <p>
     * 3.   LocalDateTime =>  contains both a date and time, but no time zone!
     * <p>
     * !   Java count stating with 0! Mounts are an exception, are counted with 1, like the human beeings do   !
     *
     *  *** -> For all the LocalDateTime methods
     *         [ Example: public static LocalDateTime of(int year, int month, int dayOfTheMonth, int hour, int Munute) ]
     *          we do not use a constructor. The date and time classes have private constructors to force us to use the static methods.
     *        Private constructor force us to use the static methods!
     *   FOR EXAM: LocalDate d = new LocalDate() ; ----> !!!! DOES NOT COMPILE !!!! the constructor is private!!!!
     *
     */

    public static void main(String[] args) {

        System.out.println( LocalDate.now() );   /**     contains only date ! NO TIME!    */
        System.out.println( LocalTime.now() );     /**   contains only time ! NO DATE!  */
        System.out.println( LocalDateTime.now() );   /** contains TIME + DATE!        */

        System.out.println( "----------------------------------------------------" );

        LocalDate date1 = LocalDate.of( 2015, 5, 20 );
        LocalDate date2 = LocalDate.of( 2015, Month.MAY, 20 );
        System.out.println( date1 );
        System.out.println( date2 );

        System.out.println( "----------------------------------------------------" );


        LocalTime time1 = LocalTime.of( 6, 15 );
        LocalTime time2 = LocalTime.of( 6, 15, 30 );
        LocalTime time3 = LocalTime.of( 6, 15, 30, 200 );

        System.out.println( "1 : " + time1 + "  " + "2 : " + time2 + "  " + "3 : " + time3 );

        System.out.println( "----------------------------------------------------" );

        LocalDateTime dateTimeA = LocalDateTime.of( 2015, Month.DECEMBER, 20, 6, 15, 53, 2000 );
        LocalDateTime dateTimeB = LocalDateTime.of( date1, time1 );
        System.out.println(dateTimeA);
        System.out.println(dateTimeB);

        System.out.println( "----------------------------------------------------" );


    }

}
