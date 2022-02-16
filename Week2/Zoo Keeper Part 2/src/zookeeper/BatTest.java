package zookeeper;

public class BatTest {
    public static void main(String[] args) {
        Bat dracula = new Bat();
        // attack town 3 times
        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();
        dracula.displayEnergy();

        // eat humans 2 times
        dracula.eatHumans();
        dracula.eatHumans();
        dracula.displayEnergy();

        // fly 2 times
        dracula.fly();
        dracula.fly();
        dracula.displayEnergy();
    }
}
