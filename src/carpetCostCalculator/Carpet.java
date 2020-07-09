package carpetCostCalculator;

public class Carpet {

    private double cost;

    Carpet(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    public double getCost(){
        return this.cost;
    }
}
