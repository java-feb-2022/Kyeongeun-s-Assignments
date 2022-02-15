import java.util.ArrayList;
public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }
    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        menu.add(item);
        item.setIndex(menu.size() - 1);
    }
    public void displayMenu(){
        System.out.println("===== MENU =====");
        for(Item item: menu) {
            item.display();
        }
    }
    public void addMenuItemByInput(){
        System.out.println("Add new Menu!");
        String itemName = "start";
        while(true) {
            System.out.println("Please enter new menu item name:(q- quit, s-show menus)");
            itemName = System.console().readLine();
            if(itemName.equals("q")) {
                System.out.println("Done...");
                break;
            } else if (itemName.equals("s")) {
                displayMenu();
                continue;
            }
            System.out.println("Please enter the price of the item:");
            try {
                double price = Double.parseDouble(System.console().readLine());
                addMenuItem(itemName, price);
            } catch(Exception e) {
                System.out.println(e);
                System.out.println("Please enter a valid number");
            } 
        }
    }
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
        // Create a new order with the given input string
        Order order = new Order(name);

        // Show the user the menu, so they can choose items to add.
        displayMenu();

    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            try{
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            } catch(Exception e) {
                System.out.println(e);
                System.out.println("Please choose a valid number");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order.display();
    }
}
