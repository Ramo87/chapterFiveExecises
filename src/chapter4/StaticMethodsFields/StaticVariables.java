package chapter4.StaticMethodsFields;

import java.util.ArrayList;

/**
 * PAG 185
 */
public class StaticVariables {

    private static final ArrayList<String> values = new ArrayList<>(); /** intrebare pt alex!!! dc?? ca e final */
    public static void main(String[] args) {
        values.add("changed");
        values.add( "newValue" );
        System.out.println(values);
    }


}
