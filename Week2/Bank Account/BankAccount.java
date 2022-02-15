import java.util.Random;
import java.util.HashMap;

public class BankAccount {
    private long accountNumber;
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private static int numberOfAccounts = 0;
    private static double totalAmount = 0.0;
    private static HashMap<Long, Boolean> accountMap = new HashMap<>();
    private Random randMachine = new Random();

    private long generateRandomAccountNumber() {
        long newNum = 0;
        // prevent duplication of accountNumber 
        while (true){
            newNum = (long)randMachine.nextInt(100000) * 100000;
            newNum += (long)randMachine.nextInt(100000);
            if (Boolean.TRUE.equals(accountMap.get(newNum))) {
                // duplicated!!!!
                // generate another key
            } else {
                accountMap.put(newNum, Boolean.TRUE);
                break;
            }
        }
        return newNum;
    } 
    public BankAccount() {
        accountNumber = generateRandomAccountNumber();
        numberOfAccounts++; 
    }
    public double getChecking() {
        return checkingBalance;
    }
    public double getSavings() {
        return savingsBalance;
    }
    public void deposit(boolean isChecking, double amount){
        if (amount < 0) {
            System.out.printf("Cannot deposit negative number: $%,.2f\n", amount);
        } else {
            if (isChecking) {
                checkingBalance += amount;
            } else {
                savingsBalance += amount;
            }
            totalAmount += amount;
        }
    }
    public void withdraw(boolean isChecking, double amount){
        System.out.printf("Trying to withdrow: $%,.2f\n", amount);
        if (isChecking) {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalAmount -= amount;
                System.out.printf("Success! checking balance: $%,.2f\n", checkingBalance);
            } else {
                System.out.printf("Insufficent checking balance: $%,.2f\n", checkingBalance);
            }
        } else {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalAmount -= amount;
                System.out.printf("Success! savings balance: $%,.2f\n", savingsBalance);
            } else {
                System.out.printf("Insufficent savings balance: $%,.2f\n", savingsBalance);
            }
        }
    }
    public double getTotal() {
        return checkingBalance + savingsBalance;
    }
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Checking: $%,.2f\n", checkingBalance);
        System.out.printf("Savings: $%,.2f\n", savingsBalance);
        System.err.printf("Total: $%,.2f\n", getTotal());
    }
    public static int getNumberOfAccount(){
        return numberOfAccounts;
    }
    public static double getTotalAmount() {
        return totalAmount;
    }
}
