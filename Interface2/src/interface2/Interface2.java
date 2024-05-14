
package interface2;

import animal.Cat;
import animal.Dog;


public class Interface2 {

    
    public static void main(String[] args) {
       
        
        Cat c=new Cat();
        System.out.println(c.makeSound());
        
        Dog d=new Dog();
        System.out.println(d.makeSound());
    }
    
}
