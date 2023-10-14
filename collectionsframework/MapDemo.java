package collectionsframework;
import java.util.Map;
import java.util.HashMap;
public class MapDemo
{
    public static void main(String[] args)
    {
        Map<Integer,String> student = new HashMap<>();
        student.put(101, "UsainBolt");
        student.put(102, "Mofrah");
        student.put(103, "PTUsha");
        student.put(105,"SachinTedulkar");
        System.out.println("HashMap: "+student);
        student.put(103,"ViratKohli");
        System.out.println("HashMap: "+student);
        System.out.println("HashMap-keySet: "+student.keySet());
        System.out.println("HashMap-values: "+student.values());
        System.out.println("HashMap-entrySet: "+student.entrySet());
        System.out.println("HashMap-get(): "+student.get(105));
        System.out.println("HashMap-"+student.containsKey(102));
        System.out.println("HashMap-"+student.containsValue("Mofrah"));
        System.out.println("HashMap-getOrDefault(103): "+student.getOrDefault(103, "default"));
        System.out.println("HashMap-getOrDefault(107): "+student.getOrDefault(107, "NIET"));
    }
}
