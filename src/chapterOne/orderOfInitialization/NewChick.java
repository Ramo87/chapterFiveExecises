package chapterOne.orderOfInitialization;

public class NewChick {



    private String name = "fluffy";
    private String Public = "validIdentifier";
    //today = new java.util.Date();
    int value = Integer.parseInt( null ); //int value = null does not complile - int e primitiva si nu poate be assignd with null. only for object is possible
    String s = null;
    {
        System.out.println( "something" );
        System.out.println(value);
    }
    public NewChick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        NewChick chick = new NewChick();
        System.out.println( chick.name );
    }
}



