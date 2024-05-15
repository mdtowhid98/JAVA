
package geomatry;


public class Rectangle<T extends Number>extends Geomatry<T>{
    
    
    private T length;
    private T width;

    public Rectangle() {
    }

    public Rectangle(T length, T width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(T length, T width, T color, T filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    @Override
    public <T> void getPerimeter() {
        double perimeter = 2 * (length.doubleValue() + width.doubleValue());
        System.out.println("Perimeter: " + perimeter);

    }

    @Override
    public <T> void getArea() {

        double area = length.doubleValue() * width.doubleValue();
        System.out.println("Area: " + area);
    }
    
    
}
