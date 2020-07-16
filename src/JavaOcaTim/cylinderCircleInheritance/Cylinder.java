package JavaOcaTim.cylinderCircleInheritance;

/**
 * Created by Loky on 09/07/2020.
 */
public class Cylinder extends Circle {
    private double height;

    Cylinder(double radius, double height) {
        super(radius);

        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        return getArea() * height;   }
}
