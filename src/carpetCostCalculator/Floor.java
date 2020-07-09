package carpetCostCalculator;


public class Floor {

    private double width; /*variabilele de instanta, pentru incapsulare le facem private si le acesem prin setari si geteri*/
    private double length;

    Floor(double width, double length) {

        if(length <0){
            this.length = 0;
        }else {
            this.length = length;
        }

        if(width <0) {
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public double getArea(){
        double Area = width * length;
        return Area;
    }


}
