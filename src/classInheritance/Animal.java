package classInheritance;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age) {
        this(name, age, 56, "red");
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() { /*print info of the Animnal */
        return ("The Lion is " + this.getAge() + " old"
                + "\n"
                + "His name is " + this.getName()
                + "\n"
                + "He has " + this.getWeight() + " kilos"
                + "\n"
                + "The color " + this.getColor() + " scares his opponents");

    }
}
