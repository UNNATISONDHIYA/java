
class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class Account {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.accountNumber="234567";
        a1.accountHolder="Dabit Markum";
        a1.balance=10000;
        a1.deposit(500);
        a1.withdraw(9500);
        a1.withdraw(1500);

 
    
}
}
