import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    double getItemCost() {
        return price * quantity;
    }
    void displayItem() {
        System.out.println(itemName + " - Qty: " + quantity + " - Price: " + price + " - Total: " + getItemCost());
    }
}
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();
    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to the cart.");
    }
    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from the cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Display total cost
    void displayTotalCost() {
        double total = 0;
        System.out.println("\nCart Items:");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getItemCost();
        }
        System.out.println("Total Cart Cost = " + total);
    }
}
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Notebook", 50, 2));
        cart.addItem(new CartItem("Pen", 10, 5));
        cart.addItem(new CartItem("Bag", 500, 1));
        cart.displayTotalCost();
        cart.removeItem("Pen");
        cart.displayTotalCost();
    }
}