import java.util.ArrayList;
class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}
class Bank {
    String bankName;
    ArrayList<Customer> customers;
    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }
    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " opened an account in " + bankName);
    }
    void displayCustomers() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            c.viewBalance();
        }
        System.out.println("------------------------");
    }
}