
package bankmanagement;

import java.util.Scanner;


public class BankManagement {

   
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Initial balance tk :");
        double initialBalance=scanner.nextDouble();
        
        CaculateAccount account=new CaculateAccount(initialBalance);
        
        while (true) {            
            System.out.println("\n1.Deposit"); 
            System.out.println("2.Withdraw"); 
            System.out.println("3.CheckBalance"); 
            System.out.println("4.Exit"); 
            System.out.println("5.Choose an Option"); 
            
            int choice=scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Deposit Amount :");
                    double depositAmount=scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                    
                    case 2:
                        System.out.println("Enter withDraw amount");
                        double withDrawAmount=scanner.nextDouble();
                        account.withdraw(withDrawAmount);
                    
                    break;
                    case 3:
                    account.checkBalance();
                    break;
                    case 4:
                        System.out.println("Thank you for banking bd!");
                        System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");;
            }
        }
        
        
        
    }
    
}
