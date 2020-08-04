package JavaOca2.printerExEncapsulation;

/**
 * Created by Ramona on 22/07/2020.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrintened; //we let it out of the constructor cause pages printed is set in the actually printer
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
            this.duplex = duplex;
            this.pagesPrintened = 0;
    }

   public int addToner(int tonerAmount) {
        if(tonerAmount>0 && tonerAmount <= 100){
                if(this.tonerLevel + tonerAmount >100 ){
                    return -1;
                }
         this.tonerLevel += tonerAmount;
                return this.tonerLevel;
        } else {
            return -1;
    }
   }

    public String fillTheToner() {
        return " The maximum of 100% is reached!";
    }

    public int printingPage(int pages){
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("printing in duplex mode");
        }
        this.pagesPrintened += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrintened(){
        return pagesPrintened;
    }

}
