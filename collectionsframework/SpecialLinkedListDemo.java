package collectionsframework;
import java.util.LinkedList;
public class SpecialLinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<String>();
        //add
        System.out.println("Size: "+ll.size());
        System.out.println("LinkeList: "+ll);
        ll.addFirst("Java");
        System.out.println("LinkeList after addFirst: "+ll);
        ll.addLast("C");
        ll.addLast("C++");
        ll.addLast("C#");        
        System.out.println("LinkeList after addLast: "+ll);
        ll.add(0,"Python");
        System.out.println("LinkeList after addAtSpecificPosition: "+ll);
        //reterive
        System.out.println("LinkeList getFist: "+ll.getFirst());        
        System.out.println("LinkeList getLast: "+ll.getLast());        
        System.out.println("LinkeList getAtSpecificPosition: "+ll.get(3));
        //update
        ll.set(0,"NIET");
        System.out.println("LinkeList after update[0]): "+ll);        
        //delete
        ll.removeFirst();
        System.out.println("LinkeList after removeFirst: "+ll);        
        ll.removeLast();
        System.out.println("LinkeList after removeLast: "+ll);        
        ll.remove(2);
        System.out.println("LinkeList after removeAtSpecificPosition: "+ll);        
        ll.clear();
        System.out.println("LinkeList after clear: "+ll);        
    }
}
