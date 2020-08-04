package chapter3.reviewQuestions;
                                     /** nu inteleg! */

public class Ex10 {
    public static void main(String[] args) {

        String a ="";
        a += 2;  // a= 2
        a += 'c';  // a = 2+c =2c
        a+=false; // a = 2c+false = 2cfalse
        if(a=="2cfalse")
            System.out.println("==");
        if(a.equals( "2cfalse" ))
            System.out.println("equals");



    }



}



