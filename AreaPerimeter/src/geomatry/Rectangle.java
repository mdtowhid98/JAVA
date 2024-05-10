
package geomatry;


public class Rectangle extends Geomatry{
    private int length=5;
    private int width=2;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getPeerimeter() {
        super.getPeerimeter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(length*width);
    }

    @Override
    public void getArea() {
        super.getArea(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(2*(length*width));
    }
    
    
}
