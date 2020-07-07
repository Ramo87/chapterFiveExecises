package compositionUdemyInheritance;

/**
 * Created by Loky on 07/07/2020.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacture, int cardSlots, String Bios){
        this.model = model;
        this.manufacturer = manufacture;
        this.cardSlots = cardSlots;
        this.bios = bios;


    }
    public void loadProgram(String programName) {
        System.out.println("Program" + programName + " is now loading... ");
    }
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getCardSlots (){
        return cardSlots;
    }
    public String bios() {
        return bios;
    }



}
