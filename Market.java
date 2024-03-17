import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    @Override
    public void addPerson(String person) {
        queue.add(person);
        System.out.println(person + " joined the queue.");
    }

    @Override
    public String removePerson() {
        String person = queue.poll();
        if (person != null) {
            System.out.println(person + " has been served and left the queue.");
        }
        return person;
    }

    @Override
    public void takeOrder(String order) {
        System.out.println("Order taken: " + order);
    }

    @Override
    public void processOrder() {
        String person = removePerson();
        if (person != null) {
            System.out.println("Order processed for " + person);
        }
    }

    @Override
    public void update() {
        processOrder();
    }
}
