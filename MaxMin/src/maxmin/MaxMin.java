
package maxmin;


public class MaxMin {

    
    public static void main(String[] args) {
       
        FindMaxMin maxMin=new FindMaxMin();
        
        maxMin.number1=20;
        maxMin.number2=30;
        maxMin.number3=40;
        
        FindMaxMin m=new FindMaxMin(40, 50, 20);
        
        System.out.println(maxMin.getMax());
        System.out.println(maxMin.getMin());
        
        System.out.println(m.getMax());
        System.out.println(m.getMin());
        
    }
    
}
