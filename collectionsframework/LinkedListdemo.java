package collectionsframework;
import java.util.LinkedList;
import java.util.Vector;
public class LinkedListdemo
{
    public static void main(String[] args)
    {
        //cARVUD
        //create
        LinkedList<Integer> ll = new LinkedList<Integer>();
        System.out.println("Size: "+ll.size());
        Vector v = new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        System.out.println("Vector: "+v);
        //add
        ll.add(10);
        ll.add(20);
        ll.add(0,30);
        ll.add(40);
        ll.add(0,50);
        ll.addAll(v);
        ll.addAll(0,v);
        System.out.println("LinkedList: "+ll);
        
        //retreive        
        System.out.println("LL[0]: "+ll.get(0));
        System.out.println("LL[3]: "+ll.get(3));
        System.out.println("LL[1]: "+ll.get(1));

        //verify
        System.out.println("contains(v): "+ll.contains(100));
        System.out.println("containsAll(clctn): "+ll.containsAll(v));
        
        //update        
        ll.set(0,500);
        System.out.println("LinkedList after update [0]: "+ll);
        ll.set(3,1000);
        System.out.println("LinkedList after update [3]: "+ll);

        //delete
        ll.remove();
        System.out.println("LinkedList after remove: "+ll);
        ll.remove(0);
        System.out.println("LinkedList after remove [0]: "+ll);
        ll.removeAll(v);
        System.out.println("LinkedList after removeAll(clctn): "+ll);
        ll.clear();
        System.out.println("LinkedList after clear: "+ll);
    }
}
