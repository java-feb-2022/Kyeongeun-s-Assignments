import java.util.Arrays;
import java.security.CodeSigner;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk myKiosk = new CoffeeKiosk();

        // default menu
        myKiosk.addMenuItem("banana", 2);
        myKiosk.addMenuItem("coffee", 1.5);
        myKiosk.addMenuItem("latte", 4.5);
        myKiosk.addMenuItem("capuccino", 3);
        myKiosk.addMenuItem("muffin", 4);

        // manual input
        myKiosk.addMenuItemByInput();

        // orders by customer.
        for (int i = 0; i < 4; i++) {
            
            myKiosk.newOrder();
        }
    }
}

