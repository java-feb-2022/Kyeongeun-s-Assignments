import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal() {
        return getStreakGoal(10);
    }
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices) {
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }
    public double getOrderTotal(ArrayList<Double> prices) {
        double sum = 0.0;
        for (int i = 0; i < prices.size(); i++) {
            sum += prices.get(i);
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }
    /**
     * A method displaying menus with their price
     * @param menuItems list of menus
     * @param prices list of prices
     * @return if menuItem's size is different from prices, then it returns false. Otherwise it returns true.
     */
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        } else {
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d %s -- $%5.2f\n", i, menuItems.get(i), prices.get(i));
            }
            return true;
        }

    }
    /**
     * A method adding a customer from user input via readLine
     * and showing all waiting list
     * @param customers
     */
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + " " + customers.get(i));
        }
    }
    /**
     * A method adding multiple customers 
     * @param customers - customer list
     * @param num - number of customers 
     */
    public void addCustomers(ArrayList<String> customers, int num){
        for (int i = 0; i < num; i++) {
            addCustomer(customers);
            System.out.println("\n");
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%d - $%5.2f\n", i, price * i - 0.5 * (i - 1));
        }
        
    }
}
