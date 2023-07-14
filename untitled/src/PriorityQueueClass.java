import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(11);
        pq.offer(22);
        pq.offer(13);
        pq.offer(24);
        pq.offer(15);

        System.out.println(pq); // implements min heap

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
        PriorityQueue<Integer> pqp = new PriorityQueue<>(Comparator.reverseOrder());
        pqp.offer(20);
        pqp.offer(11);
        pqp.offer(22);
        pqp.offer(13);
        pqp.offer(24);
        pqp.offer(15);
        System.out.println(pqp); // implements max heap

        pqp.poll();
        System.out.println(pqp);

        System.out.println(pqp.peek());
    }
}
