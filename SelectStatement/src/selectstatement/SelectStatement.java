
package selectstatement;

import java.util.Scanner;


public class SelectStatement {

 
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        int maxNumber;
        
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        
         System.out.println("Enter Second number");
        int secondNumber=scanner.nextInt();
        
         System.out.println("Enter third number");
        int thirdNumber=scanner.nextInt();
        
        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            maxNumber=firstNumber;
        }
        
        else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            maxNumber=secondNumber;
        }
        
         else {
            maxNumber=thirdNumber;
        }
        
       
        System.out.println(maxNumber+" it is maxNumber");
                
        
        
        
        
            
        
        
    }
    
}
