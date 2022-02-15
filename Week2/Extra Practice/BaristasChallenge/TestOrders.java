import java.util.Arrays;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        // Create 3 orders with names
        Order order3 = new Order("Cherry the Cat");
        Order order4 = new Order("Kiwi the T-Rex");
        Order order5 = new Order("Robin the Unicorn");

        // Item lists
        Item item1 = new Item("mocha", 4.0);
        Item item2 = new Item("latte", 3.0);
        Item item3 = new Item("drip coffee", 5.5);
        Item item4 = new Item("capuccino", 4.5);

        // Add more than 2 items to each of the orders        
        order1.addItem(item1);
        order1.addItem(item4);

        order2.addItem(item2);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item4);
        order3.addItem(item2);

        order4.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item1);

        order5.addItem(item1);
        order5.addItem(item1);
        order5.addItem(item1);

        // Test getStatusMessage 
        System.out.println("==== getStatusMessage() Test ====");
        order1.setIsReady(true);
        System.out.println(order1.getName() + " " + order1.getStatusMessage());
        System.out.println(order2.getName() + " " + order2.getStatusMessage());
        order3.setIsReady(true);
        System.out.println(order3.getName() + " " + order3.getStatusMessage());
        System.out.println(order4.getName() + " " + order4.getStatusMessage());
        System.out.println(order5.getName() + "'s order total: " + order5.getOrderTotal());

        // display all orders
        System.out.println("\n==== display() Test ====");
        Order.show();
    }
}

