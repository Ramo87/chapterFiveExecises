package inheritanceBBQ.bbqExample;

public class B extends A{

    public B()
    {
        //ConsolePrint.showLn("Konstruktor B.B(" ));

        System.out.println((this instanceof Object));
    }



    @Override
    protected void calculate() {
        super.calculate();
    }

    @Override
    public void calculatePublic() {
        super.calculatePublic();
    }

    public void calculatePrivate(){
        System.out.println(" metoda e private! aici e chemata in B, avem hidden metod");
    }
}


