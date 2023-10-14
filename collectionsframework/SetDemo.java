package collectionsframework;
import java.util.Set;
import java.util.HashSet;
public class SetDemo
{
    public static void main(String[] args)
    {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        System.out.println("HashSet1: "+s1);
        s1.remove(30);
        System.out.println("HashSet1-remove(30): "+s1);
        System.out.println("HashSet1-contains(20): "+s1.contains(20));
        s1.add(20);
        s1.add(50);
        s1.add(100);
        System.out.println("HashSet1: "+s1);

        Set<Integer> s2 = new HashSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(50);
        s2.add(60);
        System.out.println("HashSet2: "+s2);
        s1.addAll(s2);
        System.out.println("HashSet-Union(s1,s2): "+s1);

        Set<Integer> s3 = new HashSet<>();
        s3.add(50);
        s3.add(100);
        s3.add(150);
        System.out.println("HashSet3: "+s3);
        s1.retainAll(s3);
        System.out.println("HashSet-Intersection(s1,s3): "+s1);

        Set<Integer> s4 = new HashSet<>();
        s4.add(10);
        s4.add(40);
        s4.add(50);
        System.out.println("HashSet1: "+s1);
        System.out.println("HashSet4: "+s4);
        s1.removeAll(s4);
        System.out.println("HashSet-SymmetricDifference(s1,s4): "+s1);
        
    }
}
