public class Item {
    private String name;
    private double price;
    private int index;
    // CONSTRUCTORS
    public Item(String name, double price) {
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
    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index = index;
    }
    public void display() {
        System.out.printf("%d %s -- $%5.2f\n", this.index, this.name, this.price);
    }
}
