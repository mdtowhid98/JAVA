
package geomatry;

import java.util.Date;


public class Rectangle extends Geomatry{
  
    private int hight;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    public Rectangle(int hight, int width, boolean filled, Date createDate) {
        super(filled, createDate);
        this.hight = hight;
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return hight*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(hight+width);
    }
    
    
    
}
