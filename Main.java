public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.addPerson("Alice");
        market.addPerson("Bob");

        market.takeOrder("Apple");
        market.update();
        market.update();
    }
}

