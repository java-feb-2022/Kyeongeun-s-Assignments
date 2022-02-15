import java.util.Arrays;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Create 2 orders for unspecified guests
        Orders order1 = new Orders();
        Orders order2 = new Orders();
        // Create 3 orders with names
        Orders order3 = new Orders("Cherry the Cat");
        Orders order4 = new Orders("Kiwi the T-Rex");
        Orders order5 = new Orders("Robin the Unicorn");

        // Item lists
        Items item1 = new Items("mocha", 4.0);
        Items item2 = new Items("latte", 3.0);
        Items item3 = new Items("drip coffee", 5.5);
        Items item4 = new Items("capuccino", 4.5);

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
        Orders.show();
    }
}

