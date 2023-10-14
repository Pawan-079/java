package collectionsframework;
import java.util.LinkedList;
import java.util.Spliterator;
class Trainer
{
    int num;
    String name;
    int age;
    public Trainer(int num, String name, int age)
    {
        this.num=num;
        this.name=name;
        this.age=age;
    }
    public int getNum()
    {
        return this.num;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
public class CustomizedGenericsDemo
{
    public static void main(String[] args)
    {
        LinkedList<Trainer> trainer = new LinkedList<>();
        Trainer t1 = new Trainer(101,"Mallesh",26);
        Trainer t2 = new Trainer(102,"Ashritha",25);
        Trainer t3 = new Trainer(103,"Seema",27);
        trainer.add(t1);
        trainer.add(t2);
        trainer.add(t3);

        Spliterator<Trainer> st = trainer.spliterator();

        st.forEachRemaining((x) -> {
            System.out.println("Num: "+x.getNum());
            System.out.println("Name: "+x.getName());
            System.out.println("Age: "+x.getAge());
        });
                
    }
}
