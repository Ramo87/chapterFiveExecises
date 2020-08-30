package chapter5.understandingPolymorphism;


/**                         Polymorphism:
 *
 *                  = an object can be accessed using a reference with the same type as the object,
 *                      a reference that is a super class of the object, or a reference that defines an interface the
 *                      object implements, either directly or through a superclass;
 *                  = a cast is not required if the object is being reassinged to a super type or interface of the object;
 *
 *                  Understand P.:
 *
 *                  a. an object is an entety that exist in memory, alocated by java;
 *                  b. regarding the type of the object, the object itself does not change:
 *                    example:
 *                    all the objects in java inherit from java.lang:
 *
 *                        Lemur leumur = new Lemur();
 *                        Object leumurAsObject = lemur;
 *
 *                          In this example:
 *                          -> lemur exist as object in memory, even if it has a diferent type of reference;
 *                          -> what has change is our ability to access methods within the Lemur class with the lemusAsObject reference;
 *                          -> without an explicity cast back to Leumur, we can not access anymore the Lemur properties;
 *
 *               Important:
 *
 *               *!*  the type of the object determines witch properties exist within the object in memory;
 *               *!*  the type of the object determines witch methods and variables are accesible to the java program;
 *               !!*!! changing a reference to an object to a new reference type give you acces to new properties of the object;
 */
