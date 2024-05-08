
package exceptionhandeling;

import java.util.Scanner;


public class ExceptionHandeling {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First number");
        int number1=input.nextInt();
        System.out.println("Enter Second number");
        int number2=input.nextInt();
        
       
//        if(number2 !=0){
//         System.out.println("Result: "+number1/number2);
//        }
//        else{
//            System.out.println("Second number can't Zero(0)");
//            System.exit(1);
//        }
        
//        try {
//           System.out.println("Result: "+number1/number2); 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        QuotionWithException exeption=new QuotionWithException();
        System.out.println(exeption.quotion(number1, number2));


    }
    
}
