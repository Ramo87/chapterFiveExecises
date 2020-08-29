package chapter5.abstractClass;

/**
 *  *                  The first concrete class it must implement all the inherited
 *                  ABSTRACT methods from the "abstract" parents!
 */
public class Lion extends BigCat {

    /** (*) it is not necesarly (but it works well also if we do) to override the method getName(),
     *   because Big cat implemented it, as an intermediar : */
//    @Override
//    public String getName(){
//        return null;
//    }

        /**  A concert class it is not required to offer implementation if an intermediate abstract class provided the
             implementation! The method getName() it ios no longer abstract in the moment when reaches the Lion class*/

    @Override
    public void roar(){


    }

}
