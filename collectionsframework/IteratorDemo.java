package collectionsframework;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class IteratorDemo
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addLast(40);
        list.addFirst(20);
        list.add(80);
        list.addLast(70);
        list.addFirst(90);
        list.add(60);
        System.out.println("LinkedList: "+list);

        Iterator<Integer> it = list.iterator();
        System.out.println("");
        System.out.println("Forward:");
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        ListIterator<Integer> it1 = list.listIterator(list.size());
        System.out.println("");
        System.out.println("Reverse:");
        while(it1.hasPrevious())
            System.out.print(it1.previous()+" ");

    }
}
