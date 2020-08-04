package chapter3.reviewQuestions;

    /**   De cate ori folosim in cod valoarea literala a unui string (exemplu "Hello" - rand 19 ])
     *                           il ia din String Pool         ! */

public class Ex2 {

    public static void main(String[] args) {
        String s = "Hello";    /**  s is created and points to an object from string pool */
        String t = new String( s );   /** a new object is created type s, but not in the string pool! not efficient */
        if("Hello".equals( s ))
            System.out.println("one");  /** correct */
        if(t==s)
            System.out.println("two");  /** false, there are 2 different object, one from String Pool the other one not! */
        if(t.equals( s ))
            System.out.println("three");  /**  true */
        if("Hello" == s )
            System.out.println("four");   /**  true   */
        if ("Hello" == t)
            System.out.println("five");  /** false, compare one object from the string pool with one that was expicitly
                                                created and return false */
    }

}
