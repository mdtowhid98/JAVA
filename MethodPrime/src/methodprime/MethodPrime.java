package methodprime;

import java.util.Scanner;

public class MethodPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int userInput = input.nextInt();

        boolean result = doPrime(userInput);

        if (result) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not prime number");
        }

    }

    public static boolean doPrime(int userInput) {
        int count = 0;
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count += 1;
            }

        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
        
    }

}
