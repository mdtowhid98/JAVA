
package testabstractgeomatry;

import geomatry.Circle;
import geomatry.Geomatry;
import geomatry.Rectangle;


public class TestAbstractGeomatry {

    
    public static void main(String[] args) {
        
        Geomatry cicle=new Circle(5);
        Geomatry rectangle=new Rectangle(4,3);
        
        
        cicle.setColor("black");
        
        getDisplay(cicle);
        getDisplay(rectangle);
        
        
//        rectangle.setFilled(true);
//        rectangle.setCreateDate(14/12/2024);
        
    }
    
    public static void getDisplay(Geomatry object) {
      
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());
        System.out.println(object.getColor());
        System.out.println(object.getCreateDate());
        System.out.println(object.isFilled());
        
        
        
    }
    
}
