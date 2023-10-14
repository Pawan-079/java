package collectionsframework;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
public class ArrayDEqueDemo
{
    public static void main(String[] args)
    {
        Deque<Integer> dql = new ArrayDeque<>();
        dql.add(10);
        dql.add(15);
        dql.addFirst(20);
        dql.addLast(25);
        System.out.println("ArrayDeque: "+dql);
        System.out.println("ArrayDeque-removeFirst: "+dql.removeFirst());
        System.out.println("ArrayDeque: "+dql);
        System.out.println("ArrayDeque-removeLast: "+dql.removeLast());
        System.out.println("ArrayDeque: "+dql);
        System.out.println("ArrayDeque-remove: "+dql.remove());
        System.out.println("ArrayDeque: "+dql);
        
        System.out.println("ArrayDeque-getFirst: "+dql.getFirst());
        System.out.println("ArrayDeque-getLast: "+dql.getLast());
        dql.add(10);
        dql.add(15);
        dql.addFirst(20);
        dql.addLast(25);
        System.out.println("ArrayDeque: "+dql);
        System.out.println("ArrayDeque-peek: "+dql.peek());
        System.out.println("ArrayDeque-peekFirst: "+dql.peekFirst());
        System.out.println("ArrayDeque-peekLast: "+dql.peekLast());
        System.out.println("ArrayDeque-contains: "+dql.contains(50));
    }
}
