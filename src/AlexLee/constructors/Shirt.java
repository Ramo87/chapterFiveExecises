package AlexLee.constructors;


public class Shirt {

    private String color;
    private char size;

    public Shirt() {
    }

    public Shirt(String color, char size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void putOn(){
        System.out.println("Shirt is on! Color: " + this.color + ", Size: " + this.size);
    }

    public void takeOff() {
        System.out.println("Shirt is off!");
    }

    @Override
    public int hashCode() {
        return size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) obj;
        return this.size == shirt.size && this.color.equals( shirt.color );
    }
}
