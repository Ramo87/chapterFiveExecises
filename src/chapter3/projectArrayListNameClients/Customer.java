package chapter3.projectArrayListNameClients;


public class Customer {
    private String name;
    private int age;
    private String  cityAdress;
    private String ID;

    public Customer(){
   }

   public Customer(String name, int age, String cityAdress, String ID) {
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        if(age<18){
            System.out.println("You are to young! We can NOT consider you as our potential client! Wait to grow and then come back!");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }

    public String getCityAdress(){
        return cityAdress;
    }

    public void setCityAdress(String CityAdress){
        this.cityAdress = CityAdress;
    }


}
