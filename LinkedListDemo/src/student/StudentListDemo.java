
package student;

import java.util.LinkedList;


public class StudentListDemo {
    public static void main(String[] args) {
        
        LinkedList<Student> list=new LinkedList<Student>();
        
        Student s1=new Student("Towhid","dujd", 01);
        Student s2=new Student("jfgi","dujd", 02);
        Student s3=new Student("hugkn","dujd", 03);
        
        
        list.add(s1);
        list.add(s2);
        list.add(2, s3);
        
        System.out.println(list);
        
//        for(Student s: list){
//            System.out.println(s.getId());
//            System.out.println(s.getClassName());
//            System.out.println(s.getName());
//        }
        
    }
 
}
