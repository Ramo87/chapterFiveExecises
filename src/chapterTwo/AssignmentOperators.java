package chapterTwo;

public class AssignmentOperators {

    private String newChar;

    AssignmentOperators(String Char){
        this.newChar = Char;
    }

    public static void main(String args[]){

        AssignmentOperators True = new AssignmentOperators("newChar2");
        //True = null;

       int x = 0;
       while(x++ < 10) {
       }
        String message; //
        message = "x > 10 ? Greater then : false ";
        System.out.println(message + "," + x);


        int h = 10;
        long i = (int )2 * h;

        System.out.println( i );


    }
}
