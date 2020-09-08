package chapter1.reviewQuestion;

public class Ex21 {
    int count;


    public Ex21() {
        count = 5;
    }

    public void Question21() {
        count = 4;
    }

    public static void main(String[] args) {
        Ex21 s = new Ex21();
        System.out.println( s.count );
        s.count = 56;

        int     i;
        double  d;
        boolean b;

        Object obj;
        System.out.println();
        System.out.println( s.count );

    }

}

    /** exercitiul pt exam era asa:  l-am gresit. la sf spune ca e chemat constructorul default care pune valoare la 0.
     *
     *
     *
     public class Question21{

     int count;

     public void Question21(){
     count = 5;
     }

     public static void main(String[] args) {
     Question21 s = new Question21();
     System.out.println(s.count);
     }
     */


