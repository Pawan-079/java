package collectionsframework;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        System.out.println("PriorityQueue: "+pq);
        pq.add(20);
        System.out.println("PriorityQueue: "+pq);
        pq.add(30);
        System.out.println("PriorityQueue: "+pq);
        pq.add(40);
        System.out.println("PriorityQueue: "+pq);
        pq.remove();
        System.out.println("PriorityQueue-remove: "+pq);
        System.out.println("PriorityQueue-peek: "+pq.peek());
        System.out.println("PriorityQueue-poll: "+pq.poll());
        System.out.println("PriorityQueue: "+pq);
    }
}
