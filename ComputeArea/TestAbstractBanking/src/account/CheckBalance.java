package account;

public class CheckBalance extends BankAccount {

    private double withdrawLimit;
    private double fee;

    public CheckBalance() {
    }

    public CheckBalance(double withdrawLimit, double fee) {
        this.withdrawLimit = withdrawLimit;
        this.fee = fee;
    }

    public CheckBalance(double withdrawLimit, double fee, double balance) {
        super(balance);
        this.withdrawLimit = withdrawLimit;
        this.fee = fee;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double deposit(double amount) {
        // Update the balance by adding the deposited amount
        super.setBalance(super.getBalance() + amount);
        return super.getBalance();
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= withdrawLimit) {
            // Update the balance by subtracting the withdrawn amount
            super.setBalance(super.getBalance() - amount);
        } else {
            // Apply fee for exceeding withdrawal limit
            super.setBalance(super.getBalance() - amount + fee);
        }
        return super.getBalance();
    }

    @Override
    public double calculateInterest() {
        // Checking accounts typically don't earn interest
        return 0.0;
    }
}
