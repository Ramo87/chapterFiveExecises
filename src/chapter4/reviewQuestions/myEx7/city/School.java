package chapter4.reviewQuestions.myEx7.city;

/** The two classes are in different packages, which means private access and
 default (package private) access will not compile. Additionally, protected access will
 not compile since School does not inherit from Classroom. Therefore, only line 8 will
 compile because it uses public access. */

public class School {
    public static void main(String[] args) {
        //System.out.println(Classroom.globalKey);
        //Classroom room  = new Classroom(101, "Mrs. Anderson");
        //System.out.println(room.roomNumber);
        //System.out.println(room.floor);
        //System.out.println(room.teacherName);
    }


}
