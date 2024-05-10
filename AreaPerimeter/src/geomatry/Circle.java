
package geomatry;


public class Circle extends Geomatry{

   
    
    private int radius=5;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getPeerimeter() {
        super.getPeerimeter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(Math.PI*radius*radius);
    }

    @Override
    public void getArea() {
        super.getArea(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(2*Math.PI*radius);
    }

  
    
    
}
