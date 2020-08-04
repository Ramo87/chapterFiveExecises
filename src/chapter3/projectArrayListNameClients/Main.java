package chapter3.projectArrayListNameClients;

import java.util.List;

/**
 * Created by Loky on 31/07/2020.
 */
public class Main {

    public static void main(String[] m){
        Customer one = new Customer(  );
        Customer two = new Customer(  );

        Company firma = new Company();

        List<Customer> customers = firma.getCustomers();
        customers.add( one );
        customers.add( two );

        for( Customer c : firma.getCustomers()) {
            System.out.println(c);
        }
    }

}
