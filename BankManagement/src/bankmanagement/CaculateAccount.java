package bankmanagement;

public class CaculateAccount {

    private double balance;

    public CaculateAccount() {
    }

    public CaculateAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CaculateAccount{" + "balance=" + balance + '}';
    }

    public void deposit(double amount) {
      
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current balance: " + balance);
      
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount);
            System.out.println("current balance "+balance);
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void checkBalance() {
        System.out.println(balance);
    }
}
