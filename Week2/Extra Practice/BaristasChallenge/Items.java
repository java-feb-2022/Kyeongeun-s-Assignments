public class Items {
    private String name;
    private double price;
    // CONSTRUCTORS
    public Items(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // ACCESSORS & MUTATORS
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void display() {
        System.out.printf("%s - $%5.2f\n", this.name, this.price);
    }
}
