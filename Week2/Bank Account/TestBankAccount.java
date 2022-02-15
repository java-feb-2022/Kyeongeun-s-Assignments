import java.util.prefs.BackingStoreException;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        BankAccount account5 = new BankAccount();

        boolean IS_CHECKING = true;
        boolean IS_SAVINGS = false;

        account1.deposit(IS_CHECKING, 10000.00);
        account1.deposit(IS_SAVINGS, 200000.12);
        account2.deposit(IS_CHECKING, 13133.22);
        account2.deposit(IS_SAVINGS, 22233.38);
        account3.deposit(IS_CHECKING, 421333.57);
        account3.deposit(IS_SAVINGS, 343253.13);
        account4.deposit(IS_CHECKING, 7833.93);
        account4.deposit(IS_SAVINGS, 44337.70);
        account5.deposit(IS_CHECKING, 9542.25);
        account5.deposit(IS_SAVINGS, 244444433.28);
        System.out.println("===== Total Amount Test =====");
        System.out.println("Total: " + BankAccount.getTotalAmount());

        System.out.println("===== Display Test =====");
        account1.display();
        account2.display();
        account3.display();
        account4.display();
        account5.display();

        System.out.println("===== Withdraw Test =====");
        double money = 150000000;
        account5.withdraw(IS_CHECKING, money);
        account5.withdraw(IS_SAVINGS, money);

        System.out.println("===== Deposit Negative Number Test =====");
        account1.deposit(IS_CHECKING, -3);
        account1.display();
    }
}
