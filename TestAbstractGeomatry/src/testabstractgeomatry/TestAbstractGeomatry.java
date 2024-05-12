package testabstractgeomatry;

import geomatry.Circle;
import geomatry.Geomatry;
import geomatry.Rectangle;
import java.util.Date;

public class TestAbstractGeomatry {
    
    public static void main(String[] args) {
        
        Geomatry circle = new Circle(5);
        
        Geomatry rectangle = new Rectangle(4, 3);
        
        circle.setColor("Blue");
        Date datecreated = null;
        circle.setDatecreated(datecreated);
        circle.setFilled(true);
        
        displayGeomatry(circle);
        displayGeomatry(rectangle);
        
    }
    
    public static void displayGeomatry(Geomatry obj) {
        System.out.println(obj.getArea());        
        System.out.println(obj.getPerimeter());        
        System.out.println(obj.getColor());        
        System.out.println(obj.getDatecreated());        
        System.out.println(obj.isFilled());        
    }
}
