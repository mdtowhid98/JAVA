<<<<<<< HEAD

package geomatry;


public class Circle {
  private double radius;
=======
package geomatry;

public class Circle extends Geomatry {

    private double radius;
>>>>>>> 1f66b498d7f22f5d1f620f5ebb1f6254ae8bce58

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, String color) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

<<<<<<< HEAD
=======
    @Override
>>>>>>> 1f66b498d7f22f5d1f620f5ebb1f6254ae8bce58
    public double getArea() {
        return Math.PI * radius * radius;
    }

<<<<<<< HEAD
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
  
=======
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

>>>>>>> 1f66b498d7f22f5d1f620f5ebb1f6254ae8bce58
}
