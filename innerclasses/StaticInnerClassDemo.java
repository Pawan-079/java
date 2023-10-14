package innerclasses;
public class StaticInnerClassDemo
{
    int num = 102;
    String name = "nikhil";
    public void display()
    {
        System.out.println("display");
    }
    static class InnerClass
    {
        StaticInnerClassDemo obj = new StaticInnerClassDemo();
        int num=200;
        public void show()
        {
            System.out.println(obj.name);
            obj.display();
            System.out.println("show in static inner class");
        }
    }
    public static void main(String args[])
    {
        StaticInnerClassDemo obj= new StaticInnerClassDemo();
        //StaticInnerClassDemo.InnerClass ic = obj.new InnerClass();
        InnerClass ic = new InnerClass();
        System.out.println(ic.num);
        ic.show();
    }
}
