
package bankmanagementsystem;


public class CheckingAccount extends BankAccount{

    private int balance;

    public CheckingAccount() {
    }

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "balance=" + balance + '}';
    }
    
    
    
    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void withdraw(double amount) {
 
if (balance >= amount) {
            balance -= amount;
            System.out.println(amount);
            System.out.println("current balance "+balance);

        } 
//else if(balance>1000){
//    System.out.println("Fee tk "+balance*.10);
//    System.out.println(amount);
//}
        
        
        
        else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void caculateInterest(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
