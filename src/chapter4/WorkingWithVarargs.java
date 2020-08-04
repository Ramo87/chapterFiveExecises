package chapter4;

/**     Varargs element must be the last elemnt in a method s parameter list;
 *
 */
public class WorkingWithVarargs {

    public static void main(String [] args) {
        walk(1);                /** 0 -  int... nums nu are niciun  element */
        walk(1, 2);       /** 1 */
        walk(1,2,3);        /** 2 */
        walk(1, new int[] {4,5}); /** 2 */
        walk( 2,new int[]{1,2,3,3,4,4,54,5565,565} );   /** 9 */

        run(11,12,25,22);
    }

    public static void walk(int start, int... nums){
        System.out.println( nums.length);
    }

    public static void run(int... nums){
        System.out.println(nums[4]);

    }

}
