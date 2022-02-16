package zookeeper;

public class Gorilla extends Mammal{

    public Gorilla(){
        super();
    }
    public void throwSomething(String something){
        System.out.println("Gorilla threw " + something);
        this.energyLevel -= 5;

    }
    public void eatBananas(){
        System.out.println("Eating banana makes the gorilla happy");
        this.energyLevel += 10;
    }
    public void climb(){
        System.out.println("Gorilla climbed up a tree.");
        this.energyLevel -= 10;
    }

}
