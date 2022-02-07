public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.5;
        double lattePrice = 4.0;
        double cappucinoPrice = 3.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + 2 * lattePrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
 
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + mochaPrice);
            System.out.println("You paid $" + mochaPrice + ", but latte Price is $" + lattePrice);
            System.out.println("you owed $" + (lattePrice - mochaPrice));
        } else {
            System.out.println(customer3 + pendingMessage);
        }
 
    }    
}
