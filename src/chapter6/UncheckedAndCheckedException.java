package chapter6;



    /**
     *
     * - ***  Unchecked( also knowed as Runtime Exception) ==  from the class RuntimeException;
     *                  == > vom Compiler nicht geprüfte Ausnahme (zur Compiler Zeit),  (Exception) Runtime.
     *          = Object -> Throwable -> Exception, ausser RunTimeException
     *             = java.lang.NullPointerException; [ Null point = atunci cand ref duce catre null, iar noi
     *             chemam o metoda pt referinta respectiva;]
     *             = nu esti obligat!
     *
     *
     *------------------------------------------------------------------------------------------------------------------
     *
     * - ***  Checked == all subclasses from Exception, without RuntimeException!!!!
     *
     *          = > vom Compiler geprüfte Ausnahme (Exception). e obligatoriu try catch sau
     *                      sa declari metoda ca arunca exceptia. Imp: in cod
     *              e obligatiu undeva sa ai try chack (auftreten =  catch).
     *          = > includes Exceptin and all subclasses that do not extend RunTimeException
     *          = > are more anticipated - example: try to read a doc that not exist;
     *           = > esti obligat sa fol catch sau sa declari ca exceptia atunca exceptia respectiva
     *------------------------------------------------------------------------------------------------------------------
     *
     * - ***  Error => should not try to catch!!! also runtime;
     *       =>
     *       Error vs. Exception;
     *  Error == (   ) Fehler
     *  behebung = fix;
     *
     *------------------------------------------------------------------------------------------------------------------
     *
     *      Errors vs. Exception
     *      Error = something went so terible wrong that your program shoul not attempt to recover it;
     *            = example: the disk drive disappeared;
     *      Ausnahmen = weniger schweriegend
     *
     *  - ***  "throw" (werfen) vs "throws" (wirft)
     *          throw = keyword used to tell java we want to throw an Exception
     *          throws = used in the method signature to declare the exception that can occur in the statements
     *          in the method;
     * {
     *     ... verarbeitung ...
     *     throw new Exception
     * }
     *------------------------------------------------------------------------------------------------------------------
     *
     * */

