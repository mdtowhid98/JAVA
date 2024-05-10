package whennegetiveintegerbreak2;

import java.util.Scanner;

public class WhennegetiveIntegerBreak2 {

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        
        int total=0;
        while (true) {
            
            

            int number = input.nextInt();

            if (number < 0) {
                break;
            }
            
            total+=number;
        }
        System.out.println("the total number is "+total);
    }

}
