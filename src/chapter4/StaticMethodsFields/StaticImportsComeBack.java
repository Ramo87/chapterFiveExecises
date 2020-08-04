package chapter4.StaticMethodsFields;

/**   !! In a large program, static imports can be overused. When importing from
        too many places, it can be hard to remember where each static member
        comes from. !!
 */

import java.util.List;

import static java.util.Arrays.asList;     /**  static import */

/**
 * Regular
 imports are for importing classes. Static imports are for importing static members of
 classes. Just like regular imports, you can use a wildcard or import a specific member. The
 idea is that you shouldn't have to specify where each static method or variable comes from
 each time you use it. An example of when static interfaces shine are when you are referring
 to a lot of constants in another class.
 */
public class StaticImportsComeBack {

        public static void main(String[] args) {
            List<String> list = asList("one", "two"); // no Arrays.
        }
}


/**    In this example, we are specifi cally importing the asList method. This means that any
 time we refer to asList in the class, it will call Arrays.asList(). */



/**
 * The exam will try to trick you with misusing static imports. This example shows almost
 everything you can do wrong. Can you fi gure out what is wrong with each one?

 1: import static java.util.Arrays; // DOES NOT COMPILE -- Line 1 tries to use a static import to import a class. Remember that static imports are
 only for importing static members. Regular imports are for importing a class.

 2: import static java.util.Arrays.asList;

 3: static import java.util.Arrays.*; // DOES NOT COMPILE ---Line 3 tries
 to see if you are paying attention to the order of keywords. The syntax is import static
 and not vice versa.

 4: public class BadStaticImports {

 5: public static void main(String[] args) {

 6: Arrays.asList("one"); // DOES NOT COMPILE   --  Line 6 is sneaky. We imported the asList method on line 2. However,
 we did not import the Arrays class anywhere. This makes it okay to write asList("one");
 but not Arrays.asList("one");


    }   }

 There’s only one more scenario with static imports. In Chapter 1, you learned that
 importing two classes with the same name gives a compiler error. This is true of static
 imports as well. The compiler will complain if you try to explicitly do a static import of
 two methods with the same name or two static variables with the same name. For example:

    import static statics.A.TYPE;

     import static statics.B.TYPE; // DOES NOT COMPILE

 Luckily when this happens, we can just refer to the static members via their classname in
 the code instead of trying to use a static import.

 *
 * */


