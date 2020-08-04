package JavaOca2.masterChallangeHamburger;


public class HealthyBurger extends Hamburger {
    private String addition5;
    private String addition6;

    HealthyBurger() {
    }

    public HealthyBurger(String Name, String BreadRollType, String meat, double price) {
        super( Name, BreadRollType, meat, price );
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public String getAddition6() {
        return addition6;
    }

    public void setAddition6(String addition6) {
        this.addition6 = addition6;
    }




}
