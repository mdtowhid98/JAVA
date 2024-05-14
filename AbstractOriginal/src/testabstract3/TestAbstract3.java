
package testabstract3;

import geomatry.Circle;
import geomatry.Geomatry;
import geomatry.Rectangle;


public class TestAbstract3 {

   
    public static void main(String[] args) {
       
        
        
        Geomatry circle=new Circle(5);
        Geomatry rectangle=new Rectangle(7,5);
        circle.getArea();
        circle.getPerimeter();
        circle.setColor("white");
        
        
        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.setFilled(true);
        
        displayGeomatry(circle);
        displayGeomatry(rectangle);
    }
    
    public static void displayGeomatry(Geomatry object){
    
        System.out.println(" "+object.getArea()); 
        System.out.println(" "+object.getPerimeter());
        System.out.println(""+object.getColor());
        System.out.println(""+object.isFilled());
        System.out.println(""+object.getCreateDate());
        
        
    }
    
    
}
