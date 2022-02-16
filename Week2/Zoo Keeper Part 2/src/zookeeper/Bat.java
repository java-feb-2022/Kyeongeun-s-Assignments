package zookeeper;

public class Bat extends Mammal{
    public Bat(){
        this.energyLevel = 300;
    }
    public void fly() {
        System.out.println("prrrrrk");
        this.energyLevel -= 50;
    }
    public void eatHumans(){
        System.out.println("Hmmmmmmm");
        this.energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("chuuuuk");
        this.energyLevel -= 100;
    }
}
