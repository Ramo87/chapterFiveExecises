package chapter4;

/**
 * Created by Loky on 20/08/2020.
 */
public class sdss {

    public static void main (String[] args){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }
}
