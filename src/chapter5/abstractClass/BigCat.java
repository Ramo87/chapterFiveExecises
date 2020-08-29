package chapter5.abstractClass;

/**
 *  !!! WHEN an abstract class extends another abstract class,
 *                       it is not required to to provide implementation for any
 *                                          abstract methods  !!!
 */
public abstract class BigCat extends Animal {

    public abstract void roar();

    public String getName(){ /** (*) */
    return null;

    }
}
