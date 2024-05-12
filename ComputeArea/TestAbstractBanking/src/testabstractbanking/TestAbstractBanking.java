package testabstractbanking;

import account.BankAccount;
import account.CheckBalance;
import account.SavingsAccount;

public class TestAbstractBanking {

    public static void main(String[] args) {

        BankAccount savingsAccount = new SavingsAccount(0.05, 5000);
        BankAccount checkingAccount = new CheckBalance(10000, 50, 1000);

//        // Display details using polymorphism
//        displayBankAccountDetails(savingsAccount);
//        displayBankAccountDetails(checkingAccount);

        // Additional operations directly on objects
        System.out.println("\nSavings Account:");
        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
        System.out.println("Interest earned: " + savingsAccount.calculateInterest());

        // CheckingAccount operations
        System.out.println("\nChecking Account:");
        System.out.println("Initial Balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(1000);
        System.out.println("Balance after deposit: " + checkingAccount.getBalance());
        checkingAccount.withdraw(300);
        System.out.println("Balance after withdrawal within limit: " + checkingAccount.getBalance());
        checkingAccount.withdraw(700);
        System.out.println("Balance after withdrawal beyond limit: " + checkingAccount.getBalance());
    }

//    public static void displayBankAccountDetails(BankAccount account) {
//        System.out.println("Account Balance: " + account.getBalance());
//        System.out.println("Deposited: " + account.deposit(200));
//        System.out.println("Interest Earned: " + account.calculateInterest());
//        System.out.println("Withdrawn: " + account.withdraw(1000));
//    }
}
