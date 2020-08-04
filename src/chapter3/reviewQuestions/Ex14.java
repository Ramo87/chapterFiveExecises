package chapter3.reviewQuestions;

/**
 * din Java, trebuie sa printam "avaJ"
 */
public class Ex14 {

    public static void main(String[] args) {
        StringBuilder puzzle = new StringBuilder( "Java" );
           /** puzzle.reverse();   -- OK!  + si: */
           puzzle.append( "vaJ$" ).delete( 0,3 ).deleteCharAt( puzzle.length() -1 );

        System.out.println(puzzle);
    }


}
