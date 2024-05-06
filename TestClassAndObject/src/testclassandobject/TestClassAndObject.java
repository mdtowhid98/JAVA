
package testclassandobject;

import geomatry.GetCircle;


public class TestClassAndObject {

    
    public static void main(String[] args) {
       
        GetCircle getcircle =new GetCircle(8);
        
        double gc=getcircle.getArea();
        double gp=getcircle.getPerimeter();
        
        System.out.println(gc);
        System.out.println(gp);
        
    }
    
}
