package zookeeper;

public class TestGorilla {
    public static void main(String[] args) {
        Gorilla kingkong = new Gorilla();

        kingkong.displayEnergy();
        kingkong.throwSomething("Rock");
        kingkong.throwSomething("Branch");
        kingkong.throwSomething("Banana");
        kingkong.displayEnergy();
        kingkong.eatBananas();
        kingkong.eatBananas();
        kingkong.displayEnergy();
        kingkong.climb();
        kingkong.displayEnergy();
    }
}
