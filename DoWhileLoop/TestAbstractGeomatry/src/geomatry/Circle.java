package geomatry;

import java.util.Date;

public class Circle extends Geomatry {

    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, boolean filled, Date createDate) {
        super(filled, createDate);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI * radius;
    }

}
