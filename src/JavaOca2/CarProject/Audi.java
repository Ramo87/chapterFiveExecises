package JavaOca2.CarProject;

/**
 * Created by Loky on 09/07/2020.
 */
public class Audi extends Car{
    Audi(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        return "Audi -> startEngine()";
    }
    @Override
    public String accelerate(){
        return "Audi -> accelerate";
    }

    @Override
    public String brake(){
        return "Car -> brake()";
    }
}
