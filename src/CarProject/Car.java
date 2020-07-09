package CarProject;

public class Car {

    private boolean engine; // fields are private!!
    private String name;
    private int cylinders;
    private int wheels;

    public Car(){

    }

    public Car(String name, int cylindres){
        this.name = name;               //this is how we initialize a constructor
        this.cylinders = cylindres;     //this is how we initialize a constructor
        this.engine =  true;            //this is how we initialize a constructor
        this.wheels = 4;                //this is how we initialize a constructor
    }

    public String getName() {  //numele metodei tre sa fie apropiat de ceea ce face, si trebuie sa reiasa daca trebuie sau nu sa aiba return type
        return name;
    }

    public int getCylindres() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> Start Engine!";
    }

    public String accelerate() {
        return "Car -> Accelerate!";

    }

    public String brake(){
        return "Car -> brake()";
    }
}
