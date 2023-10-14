package collectionsframework;
import java.util.Vector;
public class VectorDemo
{
    public static void main(String[] args)
    {
        //create
        Vector v1 = new Vector(500);
        System.out.println("Size: "+v1.size());
        System.out.println("Capacity: "+v1.capacity());        
        //add
        v1.add(10);
        v1.add(20);
        v1.add(null);
        v1.add(10);
        v1.add(0,40);
        v1.add(2,50);
        System.out.println("Vector1: "+v1);
        Vector v2 = new Vector();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("Vector2: "+v2);
        v1.add(v2);
        System.out.println("Updated Vector1: "+v1);
        v1.addAll(v2);
        System.out.println("Updated Vector1: "+v1);
        Vector v3 = new Vector();
        v3.add(5);
        v3.add(10);
        v3.add(15);
        System.out.println("Vector3: "+v3);
        v1.addAll(4,v3);
        System.out.println("Updated Vector1: "+v1);
        System.out.println("Size: "+v1.size());
        System.out.println("Capacity: "+v1.capacity());
        //retrieval
        System.out.println("v[0]: "+v1.get(0));
        System.out.println("v[1]: "+v1.get(1));
        System.out.println("v[2]: "+v1.get(2));
        System.out.println("v[8]: "+v1.get(8));
        //verification
        System.out.println(v1.contains(10));
        System.out.println(v1.contains(60));
        System.out.println(v1.containsAll(v2));        
        //update
        v1.set(3,100);
        System.out.println(v1);
        //delete
        v1.remove(10);
        System.out.println("After removing 10: "+v1);
        v1.removeAll(v3);
        System.out.println("After removing v3: "+v1);
        v1.clear();
        System.out.println("After clear: "+v1);
    }
}
