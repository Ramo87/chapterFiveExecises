package test;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width; //intizializarea campurilor, sa ii dam valoare
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0.0;
            return;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0.0;
            return;
        }
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public static void main(String args[]) {
        Wall wall1 = new Wall( 5, 4 );
        System.out.println("area = " + wall1.getArea());
        wall1.setHeight(-1.5);
        System.out.println("height = " + wall1.getHeight());
        System.out.println("");
    }
}
