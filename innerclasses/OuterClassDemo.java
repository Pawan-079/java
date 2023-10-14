package innerclasses;
public class OuterClassDemo
{
    public static void main(String args[])
    {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass1 ic1 = oc.new InnerClass1();
        System.out.println(ic1.id);
        ic1.display();
    }
}
