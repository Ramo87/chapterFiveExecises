package chapter4.reviewQuestions;

/**
 * Line 16 does not compile because static methods are not allowed to call instance
 methods. Even though we are calling play() as if it were an instance method and an
 instance exists, Java knows play() is really a static method and treats it as such. If line
 16 is removed, the code works. It does not throw a NullPointerException on line 16
 because play() is a static method. Java looks at the type of the reference for rope2 and
 translates the call to Rope.play().
 */
public class RopeEx11 {

    public static void swing(){
        System.out.println("swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        //climb();
    }
    public static void main(String []args){
        RopeEx11 rope = new RopeEx11();
        rope.play();
        RopeEx11 rope2 = null;
        rope2.play();
    }
}
