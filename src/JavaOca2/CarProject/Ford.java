package JavaOca2.CarProject;

public class Ford extends Car{

    public Ford(String name, int cylindres){
    super(name, cylindres);
    }

    @Override
    public String startEngine(){
        return "Ford -> startEngine()";
    }

    @Override
    public String brake(){
        return "Ford -> brake()";
    }

    @Override
    public String accelerate(){
        return "Ford -> accelerate()";
    }

}
