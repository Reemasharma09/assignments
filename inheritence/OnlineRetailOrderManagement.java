class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order placed";
    }
    void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call base class constructor
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order1 = new Order(101, "2025-09-20");
        System.out.println(order1.getOrderStatus());
        order1.displayInfo();
        System.out.println("-----------------------------");
        ShippedOrder order2 = new ShippedOrder(102, "2025-09-18", "TRK12345");
        System.out.println(order2.getOrderStatus());
        order2.displayInfo();
        System.out.println("-----------------------------");
        DeliveredOrder order3 = new DeliveredOrder(103, "2025-09-15", "TRK67890", "2025-09-20");
        System.out.println(order3.getOrderStatus());
        order3.displayInfo();
    }
}