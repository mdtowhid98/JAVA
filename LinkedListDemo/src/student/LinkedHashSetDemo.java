
package student;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {
  
    public static void main(String[] args) {
        
        HashSet<String>hs=new LinkedHashSet<>();
        
        hs.add("1");
        hs.add("2");
        hs.add("3");
        
        System.out.println(hs);
        
    }
 
    
}
