
package recursionfactorial;


public class RecursionFactorial {

    
    public static void main(String[] args) {
        
        
       int n = 9; // Change this to the desired number for factorial calculation
        System.out.println("Factorial of " + n + " is: " + factorial(n));  
        
    }
    
    
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
