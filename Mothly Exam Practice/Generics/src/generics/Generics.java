
package generics;

import java.util.LinkedList;


public class Generics {

   
    public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList();
        Student<String,Integer,Integer>student=new Student<>("Towhid", 1281524, 25);
        Student<String,Integer,Integer>student1=new Student<>("edddf", 1281524, 29);
        Student<String,Integer,Integer>student2=new Student<>("esxcfrdc", 1281528, 29);
        
        list.add(student);
        list.add(student1);
        list.add(student2);
        
        System.out.println(list);
        
    }
    
}
