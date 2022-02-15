import java.util.ArrayList;
public class Orders {
    private String name;
    private boolean ready = false;
    private ArrayList<Items> items = new ArrayList<>();

    private static ArrayList<Orders> ORDERS_LIST = new ArrayList<>();

    // CONTRUCTORS
    public Orders(){
        this("");
    }

    public Orders(String name) {
        this.name = name;
        ORDERS_LIST.add(this);
    }

    // MUTATORS & ACCESSORS
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /**
     * A method that returns a message depends on the ready variable.
     * @return String depends on this.ready
     */
    public String getStatusMessage(){
        if (this.ready) {
            return "Your order is ready";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public void setIsReady(boolean ready) {
        this.ready = ready;
    }
    public void addItem(Items item){
        this.items.add(item);
    }
    /**
     * A method that returns total price of items
     * @return total price
     */
    public double getOrderTotal(){
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }
    /**
     * A method that displays this order. 
     * It displays customers name on first line,
     * and it calls each item's display method
     * and the total price.
     */
    public void display() {
        System.out.println("Customer Name: " + this.name);
        for(Items item: this.items) {
            item.display();
        }
        System.out.printf("Total: $%,.2f\n", getOrderTotal());
    }
    /**
     * A method that shows all orders.
     * It calls display method of each order.
     */
    public static void show() {
        for(Orders order : ORDERS_LIST) {
            order.display();
        }
    }

}

