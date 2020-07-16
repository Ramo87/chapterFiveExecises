package JavaOcaTim.masterChallangeHamburger;

public class Hamburger {
    private String Name;
    private String BreadRollType;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double price;
    private double priceExtraAdditions;

    Hamburger() {
    }

    Hamburger(String Name, String BreadRollType, String meat, double price) {
        this.Name = Name;
        this.BreadRollType = BreadRollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBreadRollType() {
        return BreadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        BreadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceExtraAdditions() {
        return priceExtraAdditions;
    }

    public void setPriceExtraAdditions(double priceExtraAdditions) {
        this.priceExtraAdditions = priceExtraAdditions;
    }


    public void addHamburgerAddition1(String name, double price){

    }
}
