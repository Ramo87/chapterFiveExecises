package JavaOca2.carpetCostCalculator;

/**
 * Created by Loky on 09/07/2020.
 */
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;

    }

    public double getTotalCost(){
        return this.floor.getArea() * this.carpet.getCost();
    }

}
