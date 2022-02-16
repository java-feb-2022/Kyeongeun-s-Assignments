package zookeeper;

public class Mammal {
    protected int energyLevel = 100;

    public Mammal(){
        energyLevel = 100;
    }
    public void displayEnergy() {
        System.out.println("Energy Level: "+ energyLevel);
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
