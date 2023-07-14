import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(12);
        qu.offer(13);
        qu.offer(14);
        qu.offer(15);
        qu.offer(16);
        qu.offer(17); // Safe only return true or false;
        qu.add(20); // Dangerous Can throw exception if failed to add
        System.out.println(qu.poll()); // poll, remove same work
        System.out.println(qu.remove()); //Dangerous Can throw exception if Queue is empty
        System.out.println(qu.peek()); // -- peek,element same work
        System.out.println(qu.element()); //Dangerous Can throw exception if Queue is empty
        System.out.println(qu);
    }
}
