public class BankAccount 
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber; 
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber;         
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name      : " + bankName);
            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Balance        : " + balance);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1001, 5000.0);
        BankAccount account2 = new BankAccount("Bob", 1002, 3000.0);

        // Display details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Perform transactions
        account1.deposit(2000);
        account2.withdraw(1500);

        // Show total accounts
        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}