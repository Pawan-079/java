package collectionsframework;
import java.util.TreeSet;
import java.util.SortedSet;
public class TreeSetDemo
{
    public static void main(String[] args)
    {
        SortedSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        System.out.println("TreeSet: "+ts);
        ts.add(40);
        System.out.println("TreeSet: "+ts);
        ts.add(20);
        System.out.println("TreeSet: "+ts);
        ts.add(60);
        System.out.println("TreeSet: "+ts);
        
        System.out.println("treeSet-first: "+ts.first());
        System.out.println("treeSet-last: "+ts.last());
        ts.remove(20);
        System.out.println("TreeSet-remove(20): "+ts);
        System.out.println("TreeSet-subset: "+ts.subSet(10,60));
    }
}