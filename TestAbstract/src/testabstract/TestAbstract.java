
package testabstract;

import geomatry.Circle;
import geomatry.Geomatry;
import geomatry.Rectangle;
import java.util.Date;


public class TestAbstract {

   
    public static void main(String[] args) {
        
        Geomatry circle=new Circle(5);
        
        Geomatry rectangle=new Rectangle(4,3);
        
        circle.setColor("Blue");
        
        
        
        
        displayGeomatry(circle);
        displayGeomatry(rectangle);
        
        
        
        
    }
    
    
    public static void displayGeomatry(Geomatry obj) {
        
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
        System.out.println(obj.getColor());
        System.out.println(obj.getDatecreated());
        
    }
}
