package chapterOne.understandVariables;

/**
 * Created by Ramona on 21/07/2020.
 */
public class VariablesFields {

    public static int ageStatic; // static variable
    public int age; //instant variable
    
    public static void main(String []args) {
        
        VariablesFields x= new VariablesFields();
        x.age = 34;
        System.out.println("ageStatic = " + ageStatic);
        System.out.println("age = " + x.age);
        
        
    }

}
