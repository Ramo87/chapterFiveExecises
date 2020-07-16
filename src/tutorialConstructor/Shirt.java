package tutorialConstructor;

/**
 * Created by Loky on 11/07/2020.
 */
public class Shirt {
    private String color;
    public char size;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;

    Shirt(){}
    Shirt(String color, char size, int price ){}

    /*Shirt() {
        //System.out.println( "eu nu sunt constructorul default");
    }*/

    public void putOn(){
        System.out.println("shirt is on!");

    }
    public void takeoff(){
        System.out.println("shirt is off!");
    }

    public void setColor(String newColor){
        color = newColor;

    }

    public void setSize(char newSize){
        size = newSize;
    }

    public String getColor() {
        return color;
    }
}
