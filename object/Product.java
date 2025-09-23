import java.util.ArrayList;
class Product {
    String productName;
    double price;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    void displayProduct() {
        System.out.println(productName + " - $" + price);
    }
}
class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }
    void addProduct(Product p) {
        products.add(p);
    }
    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("------------------------");
    }
}
class Customer {
    String name;
    ArrayList<Order> orders;
    Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }
    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order: " + order.orderId);
    }
    void displayOrders() {
        System.out.println("Orders for Customer: " + name);
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}