package collectionsframework;
import java.util.ArrayList;
import java.util.Vector;
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        //CARVUD
        //Create
        ArrayList<Integer> al1 = new ArrayList<Integer>(5);        
        System.out.println("Size: "+al1.size());
        //add
        al1.add(1);
        al1.add(2);
        al1.add(0,3);
        al1.add(2,4);
        al1.add(4);
        System.out.println("Size: "+al1.size());        
        al1.add(null);
        System.out.println("ArrayList1:"+al1);
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("Vector: "+v);
        al1.addAll(v);
        System.out.println("ArrayList1: "+al1);
        al1.addAll(0,v);
        System.out.println("ArrayList1: "+al1);        
        //retrieve
        System.out.println("AR[0]: "+al1.get(0));
        System.out.println("AR[2]: "+al1.get(2));
        System.out.println("AR[5]: "+al1.get(5));
        //verify
        System.out.println("contains(20): "+al1.contains(20));
        System.out.println("contains(100): "+al1.contains(100));
        System.out.println("containsAll(clctn): "+al1.containsAll(v));
        //update
        al1.set(7,100);
        System.out.println("ArrayList1 after update: "+al1);
        al1.set(3,200);
        System.out.println("ArrayList1 after update: "+al1);        
        //delete
        al1.remove(1);
        System.out.println("ArrayList1 after remove(20): "+al1);
        al1.removeAll(v);
        System.out.println("ArrayList1 after removeAll(clctn): "+al1);
        al1.clear();
        System.out.println("ArrayList1 after clear(): "+al1);
    }
}