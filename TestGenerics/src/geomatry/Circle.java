package geomatry;

public class Circle<T> extends Geomatry<T>{

    private T radius;

    public Circle() {
    }

    public Circle(T radius) {
        this.radius = radius;
    }

    public Circle(T radius, T color, T filled) {
        super(color, filled);
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    @Override
    public <T> void getPerimeter() {
       double perimeter = 2 * Math.PI * Double.parseDouble(radius.toString());
        System.out.println("Perimeter: " + perimeter);

    }

    @Override
    public <T> void getArea() {
        double area = Math.PI * Math.pow(Double.parseDouble(radius.toString()), 2);
        System.out.println("Area: " + area);

    }

  

}
