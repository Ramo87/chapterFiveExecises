package chapter2;

/**
 * Created by Loky on 26/07/2020.
 */
public class Ex19 {



    public static void main(String args[]) {
        int m = 9, n = 1, x = 0;

        while(m> n){
            m--;
            n +=2;
            x +=m +n;
        }
        Ex19 u = new Ex19();
        u.ex9();
        System.out.println(x);

    }

   void ex9() {

        for (int i = 0; i<10; ) {
            i = i++;
            System.out.println(" Hallo! ");
        }
    }
}
