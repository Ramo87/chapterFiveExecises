package JavaOca2.cylinderCircleInheritance;

public class Circle {
    private double radius;

    Circle(){

    }

    Circle(double radius){
        if(radius < 0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

}
