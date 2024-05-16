
package linkedlistdemo;

import java.util.LinkedList;



public class LinkedListDemo {

    
    public static void main(String[] args) {
        
        LinkedList<String>countryNames=new LinkedList<>();
        
        countryNames.add("Bangladesh");
        countryNames.add("Pakistan");
        countryNames.add("Bhutan");
        countryNames.add("Indonesia");
        countryNames.add(3,"Nepal");
        countryNames.addFirst("Ingland");
        countryNames.addLast("Italy");
//        countryNames.remove(3);
//        countryNames.removeFirst();
//        countryNames.removeLast();
        
        System.out.println("Countyry name is "+countryNames);
        
        for(String country : countryNames){
            System.out.println(country);
        }
        
        System.out.println(countryNames.size());
        System.out.println(countryNames.getFirst());
//        countryNames.get(1);
//        System.out.println(countryNames);
//        
////        countryNames.clear();
////        System.out.println(countryNames);
//        
//        countryNames.clone();
//        System.out.println(countryNames);
//        
//        countryNames.descendingIterator();
//        System.out.println(countryNames);
//        
//        countryNames.indexOf(1);
//        System.out.println(countryNames);
           
            
            
      
        
    }
    
}
