package chapter3.stringExercises;

public class Immutable {
    private String s = "name";
    String ss = s.concat("OfTheCountry");
    String sss = ss.substring( 0, 9 ).concat( "Person" );

    public static void main(String[] args){
        Immutable i = new Immutable();
        String newS = i.s.concat("OfTheCity ");
        System.out.println(i.s);
            System.out.println(i.ss);
        System.out.println(i.sss);
            System.out.println("1 " + newS.isEmpty());
        System.out.println("2 " + newS.length());
        System.out.println("3 " + newS.charAt( 5 ));
        System.out.println("4 " + newS.indexOf( "The" ));
        System.out.println("5 " + newS.substring( 1,2 ));
        System.out.println("6 " + newS.substring( 2 ));
        System.out.println("7 " + newS.toUpperCase());
        System.out.println("8 " + newS.toLowerCase());
        System.out.println("9 " + newS.equals( "nameOfTheCity "));
        System.out.println("10 " + newS.startsWith( "t" ));
        System.out.println("11 " + newS.endsWith( " " ));
        System.out.println("12 " + newS.contains( "the" ));
        System.out.println("13 " + newS.replace("the", "of"));
        System.out.println("14 " + "OfTheCity".trim());
        System.out.println("15 " + newS.trim());

        System.out.println("-----------------------------------");

    }
    public String getS()
    {return s;}
}
