
package question4;


public class Question4 {

   
    public static void main(String[] args) {
      
        Maxmin m=new Maxmin(10, 200, 300, 100, 50);
        
        System.out.println("Highest number is "+m.getHighest());
        System.out.println("Lowest number is "+m.getLowest());
        
    }
    
}
