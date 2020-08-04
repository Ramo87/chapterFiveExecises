package chapter4.StaticMethodsFields;

/**
 * Created by Loky on 04/08/2020.
 */
public class StaticVsInstance {

    private String name = "static class";
    public static void first(){};
    public static void second(){};
    public void third(){
        System.out.println(name);
    }

    public static void main(String []main){
        first();
        second();
        /** third(); nu se compileaza ca incercam sa chemam o metoda nestatica intr-una statica  */

        StaticVsInstance noStVar =  new StaticVsInstance();
        noStVar.third();
       // System.out.println(new StaticVsInstance().third()); * - * nu se compileaza
    }
}
