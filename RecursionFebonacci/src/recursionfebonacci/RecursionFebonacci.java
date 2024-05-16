
package recursionfebonacci;


public class RecursionFebonacci {

    
    public static void main(String[] args) {
      
        
         int n = 10; // Change this to the desired number of Fibonacci numbers
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        } 
        
    }
     public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
