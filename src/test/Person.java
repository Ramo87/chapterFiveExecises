package test;

/**
 * Created by Loky on 07/07/2020.
 */
public class Person { // cerinta o gasesc aici: https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4585938#questions
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTenn() {
        if (age > 12 & age < 15) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName == "" & lastName == "") {
            return "";
        } else if (firstName != "" & lastName == "") {
            return firstName;
        } else if (firstName == "" & lastName != "") {
            return lastName;
        } else
            return firstName + lastName;
    }

    public boolean isEmpty(){
        boolean empty;
        if (firstName.isEmpty()) empty = true;
        else empty = false;
        return empty;
    }

    public static void main(String []args){
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge( 13 );
        person.setAge( 102 );
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTenn());
        person.setFirstName( "John" );
        person.setAge( 19 );
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTenn());
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());
    }


}