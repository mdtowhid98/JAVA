package account;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, double balance) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double deposit(double amount) {
        // Update the balance by adding the deposited amount
        super.setBalance(super.getBalance() + amount);
        return super.getBalance();
    }

    @Override
    public double withdraw(double amount) {
        // Update the balance by subtracting the withdrawn amount
        super.setBalance(super.getBalance() - amount);
        return super.getBalance();
    }

    @Override
    public double calculateInterest() {
        // Calculate and return the interest earned
        return super.getBalance() * this.interestRate;
    }
}
