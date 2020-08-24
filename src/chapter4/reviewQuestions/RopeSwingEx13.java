package chapter4.reviewQuestions;
public class RopeSwingEx13 {
        private static final String leftRope;
        private static final String rightRope;
    /**  private static final String bench;
     * doesn’t compile because bench is not set
     in either of these locations */
        private static final String name = "name";
    static {
        leftRope = "left";
        rightRope = "right";
        }

    static {
            /** name = "name";
             * doesn’t compile because name is set twice:
             once in the declaration and again in the static block */

            /** rightRope = "right";
             * doesn’t compile because rightRope is set twice as well. Both are in static initialization blocks. */
    }

    public static void main(String[] args) {
           /** bench = "bench";
            * doesn’t compile because final variables are not allowed to be set after that point. */
            }
}


