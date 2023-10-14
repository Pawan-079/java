package collectionsframework;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDEqueDemo
{
    public static void main(String[] args)
    {
        Deque<Integer> dql = new LinkedList<>();
        dql.add(10);
        dql.add(15);
        dql.addFirst(20);
        dql.addLast(25);
        System.out.println("LinkedList: "+dql);
        System.out.println("LinkeList-removeFirst: "+dql.removeFirst());
        System.out.println("LinkedList: "+dql);
        System.out.println("LinkeList-removeLast: "+dql.removeLast());
        System.out.println("LinkedList: "+dql);
        System.out.println("LinkeList-remove: "+dql.remove());
        System.out.println("LinkedList: "+dql);
        
        System.out.println("LinkeList-getFirst: "+dql.getFirst());
        System.out.println("LinkeList-getLast: "+dql.getLast());
        dql.add(10);
        dql.add(15);
        dql.addFirst(20);
        dql.addLast(25);
        System.out.println("LinkedList: "+dql);        
        System.out.println("LinkedList-peek: "+dql.peek());
        System.out.println("LinkedList-peekFirst: "+dql.peekFirst());
        System.out.println("LinkedList-peekLast: "+dql.peekLast());
        
        System.out.println("LinkedList-contains: "+dql.contains(20));
    }
}
