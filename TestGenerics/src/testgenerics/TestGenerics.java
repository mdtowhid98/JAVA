
package testgenerics;

import geomatry.Circle;
import geomatry.Rectangle;

public class TestGenerics {

   
    public static void main(String[] args) {
        
        Circle circle=new Circle(5.5);
        circle.getArea();
        circle.getPerimeter();
        
        Rectangle rectangle=new Rectangle(4.2, 2.5);
        rectangle.getArea();
        rectangle.getPerimeter();
        
    }
    
}
