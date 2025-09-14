class BankAccount {
   
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
public class ATMDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Reema Sharma", 123456, 5000.00);
        System.out.println("Initial Account Details:");
        acc1.displayBalance();
        System.out.println("\n--- Performing Transactions ---");
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(7000);
        System.out.println("\nFinal Account Details:");
        acc1.displayBalance();
    }
}