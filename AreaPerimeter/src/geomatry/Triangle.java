
package geomatry;


public class Triangle extends Geomatry{
    private int side1=6;
    private int side2=6;
    private int side3=12;

    public Triangle() {
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getPeerimeter() {
        super.getPeerimeter(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println((side1+side2+side3)/2);
    }

    @Override
    public void getArea() {
        super.getArea(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(side1+side2+side3);
    }

   
    
    
}
