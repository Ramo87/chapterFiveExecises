package JavaOca2.CarProject;

/**
 * Created by Loky on 09/07/2020.
 */
public class Mitsubishi extends Car{

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitusibishi -> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitusibichi -> brake()";
    }
}
