
package bankmanagementsystem;

import java.util.Scanner;


public class BankManagementSystem {

    
    public static void main(String[] args) {
      


Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Initial balance tk :");
        double initialBalance=scanner.nextDouble();
        
        BankAccount account=new SavingAccount(initialBalance);
         System.out.println("Enter Deposit Amount :");
        int depositamount=scanner.nextInt();
        
        
        account.deposit(depositamount);
        
          System.out.println("Enter withDraw amount");
        int withdrawAmount=scanner.nextInt();
        if(withdrawAmount>1000){
            System.out.println("Fee tk "+withdrawAmount*.10);
            System.out.println(withdrawAmount+withdrawAmount*.10);
            
        }
        else{
            System.out.println(withdrawAmount);
        }
        
        
        account.withdraw(withdrawAmount);
          System.out.println("Your interest");
        account.caculateInterest(initialBalance*0.10);
        
        
    }
    
}
