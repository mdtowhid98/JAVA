package account;

public abstract class BankAccount {
   
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getters and setters for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract methods for deposit, withdraw, and calculateInterest
    public abstract double deposit(double amount);

    public abstract double withdraw(double amount);

    public abstract double calculateInterest();

    // Override toString method for better representation
    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
