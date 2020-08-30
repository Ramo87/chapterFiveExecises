package chapter5.abstractClass;

/**                                     Abstract classes:
 *
 *    1. can not be instatioated directly!
 *
 *    2. can containt 0 ore n abstract or non abstract metrhods.
 *              [ exp: "public abstract Animal{ }" is a valid abstract class event if does not contain any metrhods! ]
 *
 *    3. can not be private, protected or final!
 *
 *    4. an abstract class that inherits (extends) another abstract class
 *                                  inherits all of its abstract methods as its own abstract methods!
 *
 *    5. the 1st concrete class must provide implementation for all abstract methods that it inherits!
 *
 *      - are not requiered to have abstract methods (an abstract method has no body:  " public void findAnswer(); " )
 *      - an abstract method can only be defined in a an abstract class;
 *      - to define an NON ABSTRACT METHOD in an abstract class, we have to mark it as DEFAULT
 *      - we can not mark an abstract method (also not an abstract  class) as final
 *                              (once is final can not be extendet or overriden(methods));
 *      - an abstract method can not be marked both abstract and private!
 *      - ! the subclass can not reduce the visibility of the parent! EVEN with abstract classes,
 *                                                  the rules of visibility must be followed!
 *
 *
 *              An abstract class does not do much then to define static variables and methods (????),
 *              because they can not be instantiated.
 *                  For example, this Code will not complie:
 *                  public abstract class eel{
 *                      public static void main(String[] args)
 *                 final Eel eel = new Eel();  --> will not compile!!!
 *                  }
 *                  Sooo: an abstract class becomes usefull when it is extended in a concrete class!
 *
 *    1.                  !!! WHEN an abstract class extends another abstract class,
 *                       it is not required to to provide implementation for any
 *                                          abstract methods  !!!
 *
 *    2.              The first concrete class it must implement all the inherited
 *                  ABSTRACT methods from the "abstract" parents!
 *
 *    3.  A concert class it is not required to offer implementation if an intermediate abstract class provided the
 *    implementation!
 *
 *
 *
 *               ABSTRACT METHODS:
 *
 *               - may only be defined in an abstract class;
 *               - may not be declared private or final;
 *               - must not have a body in the abstract class;
 *               - implementing an abstract class in a concrete class, must follow the same rules as overriding!
 *
 *
 * */
