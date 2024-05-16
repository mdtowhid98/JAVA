
package student;

import java.util.HashMap;


public class HashmapDemo {
    public static void main(String[] args) {
      
        HashMap<Integer,String>customer=new HashMap<Integer,String>();
        
        customer.put(1, "Towhid");
        customer.put(2, "Raju");
        customer.put(3, "kutub");
        
        System.out.println(customer);

        System.out.println(customer.get(1));
        
        
        
    }
  
}
