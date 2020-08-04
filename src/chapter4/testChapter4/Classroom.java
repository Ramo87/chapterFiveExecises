package chapter4.testChapter4;

/**
 * Created by Loky on 10/07/2020.
 */
public class Classroom {
        private int roomNumber;
        protected String teacherName;
        static int globalKey = 54321;
        public int floor = 3;

        public Classroom(){
        }

        public Classroom(int r, String t) {
            roomNumber = r;
            teacherName = t;
        }




}
