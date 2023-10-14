package collectionsframework;
import java.util.Stack;
import java.util.Vector;
public class StackDemo
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add("Lavish");
        v.add("Prince");
        System.out.println("Vector: "+v);
        //create
        Stack<String> s = new Stack<>();
        //add
        s.add("Pawan");
        s.add("Pratyush");
        s.add(0,"Shivam");
        s.add(2,"Sonu");
        s.add(0,"Prashanth");
        System.out.println("Stack: "+s);
        s.addAll(v);
        System.out.println("Stack: "+s);
        s.addAll(0,v);        
        System.out.println("Stack: "+s);
        //retreive
        System.out.println("S[0]: "+s.get(0));
        System.out.println("S[2]: "+s.get(2));
        System.out.println("S[1]: "+s.get(1));
        //verify
        System.out.println("contains('Sonu'): "+s.contains("Sonu"));
        System.out.println("containsAll(clctn): "+s.containsAll(v));
        //update
        s.set(0,"HrithikRoshan");
        System.out.println("Stack: "+s);
        s.set(3,"Alia");
        System.out.println("Stack: "+s);
        s.set(4,"Sourabh");
        System.out.println("Stack: "+s);
        //delete
        s.remove(3);
        System.out.println("Stack: "+s);
        s.remove(0);
        System.out.println("Stack: "+s);
        s.removeAll(v);
        System.out.println("Stack: "+s);
        s.clear();
        System.out.println("Stack: "+s);
    }
}
