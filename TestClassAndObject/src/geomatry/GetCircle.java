
package geomatry;


public class GetCircle {
    
    double radius=1;

    public GetCircle() {
    }
    public GetCircle(double newRadius) {
        radius=newRadius;
    }
    
    
    public double getArea(){
    return Math.PI*Math.pow(radius, 2);
    }
    
    public double getPerimeter(){
    return 2*radius*Math.PI;
    }
    
}
