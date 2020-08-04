package inheritanceBBQ.bbqExample;

import inheritanceBBQ.staticÜbungen.ConsolePrint;

/**
 * Created by Loky on 10/07/2020.
 */
public class A implements I{

    public A()
    { super();
        ConsolePrint.showLn("Konstruktor A.A()");
        System.out.println((this instanceof Object));
    }

    protected void calculate(){
        System.out.println(" metoda e protected!");
    }

    public void calculatePublic(){
        System.out.println(" metoda e publica!");
    }

    public void calculatePrivate(){
        System.out.println(" metoda e private!");
    }
}
