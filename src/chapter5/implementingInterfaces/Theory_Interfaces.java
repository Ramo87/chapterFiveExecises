package chapter5.implementingInterfaces;

/**
 *                       INTERFACES:
 *
 *                       !! the modifiers PUBLIC and ABSTRACT are assumed, even if are written or not !!
 *
 *
 *             A: RULES
 *
 *              [ an interface can be considered as a special abstract class,
 *              as long it has a lot of abstract properties ]
 *
 *                 *-*  it can not be instatietied directly;
 *
 *                 *-* it is not requierd to have any methods;
 *
 *                 *-* may not be marked as final;
 *
 *                 *-* all top level interfaces are public or default acces; also abstract, even if it use or not;
 *                      This is why no methods in a interface is allowed to be protected, private or final;
 *
 *
 *              B:
 *               -> althought java doesn t allow multiple inheritance, it does allow classes to implement any number of intrfaces;
 *               -> an Interface is an abstract data type that defines a list of abstract public methods;
 *               -> any class that implements the interface must provide the abstract methods;
 *               -> an interface can also have default methods =
 *               -> a class can implement multiple interfaces, each separated by a comma:
 *                                example: public class Animal implements Elephant, Herbivore, NiceAnimals
 *
 *
 *              C: -> Invalid modifiers for Interfaces:
 *                   These example do not compile:
 *                          private*(confilcts with public) final*(confilcts with abstract) interface CanCrawl{
 *                          private* void dig();
 *                          protected* abstract double depth();
 *                          public final* void surface(); }
 *
 *
 *              D: Inheriting an Interface:
 *
 *         -> an interface that extends(inherits) another interface, as well as an abstract class that implements
 *         an interface, inherits all hos abstract methods as its own;
 *
 *         ->the first concrete class that implements an interface, or extends an abstract class that that implements an
 *         interface, must provide an implementation for all of the inherited abstract methods;
 *
 *         -> an interface may be extend by another interface using the word "extends"
 *
 *               ->
 *               -> new to JAVA 8: default and static can be applied to interfaces!
 *
 *
 *
 *
 *
 */
