
package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

     
    public static void main(String[] args) {
        
     ArrayList<Integer>number=new ArrayList<Integer>();
        
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 50);
        
        System.out.println(number);

//    for(int x :number){
//        System.out.println(x);
//    }

//        Iterator itr=number.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
            System.out.println("size is "+number.size()); 
            number.remove(2);
            System.out.println("removing elments "+number);
            
//            number.removeAll(number);
//            System.out.println("after removing all " +number);
            
            boolean check =number.isEmpty();
            System.out.println("arraylist empty "+check);
            
            boolean cotain=number.contains(50);
            System.out.println("50 is the contain "+cotain);
            
           int pos= number.indexOf(20);
           System.out.println("40 index of "+pos);
           
           number.set(1, 80);
           System.out.println("replace index 1= "+number);
           
           int i=number.get(0);
           System.out.println("position of index 0=  "+i);
        }
       
        
    }
    

