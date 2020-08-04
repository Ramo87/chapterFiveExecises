package repeatFromBeginingCh5.ExtendingAClass;


public class Animal2 {

    public void setAge(int age) {
        this.age = age;
    }

    private int age; //o variabila care este privata, nu poate fi accesata decat prin geteri si setari

    public int getAge() {
        return age;
    }
}

class Lion extends Animal2 {

    Lion() {
        Animal2 kingLion = new Animal2();
        kingLion.setAge( 34 );
        this.setAge( 34 );
    }

    @Override
    public void setAge(int age) {
        Animal2 kingLion = new Animal2();
        kingLion.setAge( 34 );
        super.setAge( age );
    }


    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println( "The " + l.getAge() + " year old lion says : roar!" );
    }
}
