package JavaOca2.printerExEncapsulation;

/**
 * Created by Ramona on 22/07/2020.
 */

public class Main {
    public static void main(String args[]){

        Printer printer = new Printer(50, true);

        System.out.println("intial page cout = " + printer.getPagesPrintened());
        int pagesPrinted = printer.printingPage( 4 );
        System.out.println("pafes printer was " + "new total print count for printer " + printer.getPagesPrintened());

    }
}
