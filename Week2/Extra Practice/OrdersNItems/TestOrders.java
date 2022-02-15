import java.util.Arrays;
import java.util.ArrayList;
public class TestOrders {
    /**
     * A methods that prints order attributes
     * @param order
     */
    public static void printOut(Order order) {
        System.out.println("==== order ====");
        System.out.printf("Name: %s\n", order.name);
        System.out.printf("Total: %s\n", order.total);
        System.out.printf("Ready: %s\n", order.ready); 
        System.out.print("Items: ");
        for (int i = 0; i < order.items.size(); i++) {
            System.out.printf("%s(%s)", order.items.get(i).name, order.items.get(i).price);
            if (i < order.items.size() - 1) {
                System.out.printf(", ");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        item1.name = "mocha";
        item1.price = 4.0;
        item2.name = "latte";
        item2.price = 3.0;
        item3.name = "drip coffee";
        item3.price = 5.5;
        item4.name = "capuccino";
        item4.price = 4.5;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        // the results
        // Name: Cindihuri
        // Total: 0.0
        // Ready: false
        order1.items = new ArrayList<>();
        order2.items = new ArrayList<>();
        order3.items = new ArrayList<>();
        order4.items = new ArrayList<>();
        
        
        order2.items.add(item1);
        order2.total += item1.price;
        printOut(order2);

        order3.items.add(item4);
        order3.total += item4.price;
        printOut(order3);

        order4.items.add(item2);
        order4.total += item2.price;
        printOut(order4);

        order1.ready = true;
        printOut(order1);

        for (int i = 0; i < 2; i++) {
            
            order4.items.add(item2);
            order4.total += item2.price;
        }
        printOut(order4);

        order2.ready = true;
        printOut(order2);
    }
}

