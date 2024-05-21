
package generics78;

import generics.Student;


public class Generics78 {

   
    public static void main(String[] args) {
       
        Student<String,Integer,Integer>s1=new Student<>("Towhid", 25, 1281524);
        Student<String,Integer,Integer>s2=new Student<>("cdbb hb", 29, 1281529);
        Student<String,Integer,Integer>s3=new Student<>("ghvh", 25, 1281528);
        Student<String,Integer,Integer>s4=new Student<>("tffv", 22, 1281522);
        
        System.out.print(s1+" "+s2+" "+s3+" "+s4);
        
    }
    
}
