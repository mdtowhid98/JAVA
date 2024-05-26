package recursionfactorial;

import java.util.Scanner;

public class RecursionFactorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }    
}
