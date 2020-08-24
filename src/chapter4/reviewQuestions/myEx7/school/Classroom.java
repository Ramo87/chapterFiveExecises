package chapter4.reviewQuestions.myEx7.school;

/**
 * The two classes are in different packages, which means private access and
 default (package private) access will not compile. Additionally, protected access will
 not compile since School does not inherit from Classroom. Therefore, only line 8 will
 compile because it uses public access.
 */
public class Classroom {

    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;

    Classroom(int r, String t){
        roomNumber = r;
        teacherName = t;

    }



}
