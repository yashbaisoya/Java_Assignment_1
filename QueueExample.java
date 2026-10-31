import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        
        System.out.println("Queue after enqueue: " + queue);
        
        // Dequeue one element
        queue.poll();
        
        System.out.println("After dequeue: " + queue);
    }
}