
package geomatry;

import java.util.Date;


public class Rectangle extends Geomatry{
   private double length;
   private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, boolean filled, Date datecreated) {
        super(filled, datecreated);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
   
   

    @Override
    public double getArea() {
        
        return length*width;
        
    }

    @Override
    public double getPerimeter() {
        
        return 2*(length+width);
    }

   
   
    
    
}
