package recursionfactorial2;


import java.util.Scanner;
import recursion.SubFactorial;


public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int fac= scanner.nextInt();
//        System.out.println(factorial(n));


        SubFactorial sf=new SubFactorial();
        System.out.println("Factorial of "+fac+" is "+sf.factorial(fac));
        

    }

//    public static int factorial(int n) {
//        if (n == 0 ) {
//            return 1;
//        }
//        else{
//        return n*factorial(n-1);
//        }
//    }

}
