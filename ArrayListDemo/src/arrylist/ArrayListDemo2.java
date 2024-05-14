
package arrylist;

import java.util.ArrayList;


public class ArrayListDemo2 {
    public static void main(String[] args) {
        
        ArrayList<Integer>number1=new ArrayList<>();
        ArrayList<Integer>number2=new ArrayList<>();
        ArrayList<Integer>number3=new ArrayList<>();
        ArrayList<Integer>number4=new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println("number1 "+number1);
        
        number2.add(50);
        number2.add(60);
        number2.add(70);
        number2.add(80);
        System.out.println("number2 "+number2);
        
        number3.add(90);
        number3.add(100);
        number3.add(110);
        number3.add(120);
        System.out.println("number3 "+number3);
        
        number4.addAll(number2);
        System.out.println("number4 "+number4);
        
        boolean result=number2.equals(number4);
        System.out.println("equals "+result);
        
    }
 
}
