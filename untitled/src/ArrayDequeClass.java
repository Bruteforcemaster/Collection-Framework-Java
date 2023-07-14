import java.util.ArrayDeque;

public class ArrayDequeClass {// Double ended queue
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);// normally add element as queue from end
        adq.offer(11);
        adq.offer(12);
        adq.offer(13);
        adq.offer(14);
        adq.offer(15);
        adq.offer(16);
        adq.offerFirst(23);// add elemant at start
        adq.offerLast(25);// add elemant at end
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);
    }
}
