package chapter1.reviewQuestion;

public class Ex3ComeBack {

    public static void main(String[] args) {
        int x = 0;
        while (++x < 10) {}
        String message = x > 10 ? "Graten than" : "false";
        System.out.println( message + ", " + x );
    }

}


