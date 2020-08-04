package chapter3.stringBuilderExercises;

public class SbMutabilityAndChaining {
    private StringBuilder sb = new StringBuilder( "Alex" );

    public static void main(String[] args) {
        SbMutabilityAndChaining sb1 = new SbMutabilityAndChaining();

        StringBuilder sb2 = sb1.sb.append( "+Ramo" );
        StringBuilder same = sb1.sb.append( "+NoEnd" );

        System.out.println(sb1);
        System.out.println( "----------------------------" );
        System.out.println( sb2 );
        System.out.println( "----------------------------" );
        System.out.println( same );
        System.out.println( "----------------------------" );

        StringBuilder sbA = new StringBuilder( "start" ); //(? nu am inteles aici de ce este acelasi obiect )
        sbA.append( "+middle" );
        StringBuilder same1 = sbA.append( "+end" );

        System.out.println(sbA);
        System.out.println( "----------------------------" );
        System.out.println(same1);
        System.out.println(same1.equals( sbA ));

        StringBuilder a = new StringBuilder();
        StringBuilder b = a.append( "de" );
        b = b.append( "f" ).append( "g" );
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a.equals( b ));

    }
}
