import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        /* ============ App Test Cases ============= */
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
        int testWeek = 14;
        System.out.printf("Purchases nedded by week %d: %s \r\n", testWeek, appTest.getStreakGoal(testWeek));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));
 
        ArrayList<Double> priceList = new ArrayList<Double>();
        priceList.add(3.5);
        priceList.add(2.7);
        priceList.add(4.5);
        priceList.add((double)2);
        System.out.printf("Another order total: %s \n\n", appTest.getOrderTotal(priceList));

        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        //appTest.displayMenu(menu);
        appTest.displayMenu(menu, priceList);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
        // sensei bonus test
        appTest.addCustomers(customers, 3);


        System.out.println("\n----- Price Chart Test-----");
        appTest.printPriceChart("latte", 4.00, 7);
        appTest.printPriceChart("mocha", 5.50, 4);
    }
}
