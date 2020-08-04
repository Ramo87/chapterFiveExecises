package chapter3.projectArrayListNameClients;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Loky on 31/07/2020.
 */
public class Company {

    private List<Customer> customers;

   Company(){
       this.customers = new ArrayList<>(  );
   }

   public List<Customer> getCustomers(){
       return customers;
   }
}
