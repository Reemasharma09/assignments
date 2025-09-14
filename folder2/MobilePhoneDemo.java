class MobilePhone {
    String brand;
    String model;
    double price;
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}
public class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 79999.00);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 74999.50);
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();
        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}