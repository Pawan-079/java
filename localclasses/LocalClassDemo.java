/*LocalClass demonstration*/
package localclasses;
public class LocalClassDemo
{
    int id=100;
    public void method()
    {
        System.out.println("method in outer class");
    }
    public static void show()
    {
            class LocalClass
            {
                int id=200;
                public void wish()
                {
                    LocalClassDemo obj = new LocalClassDemo();
                    System.out.println(obj.id);
                    obj.method();
                    System.out.println(id);
                }
            }
            LocalClass lc = new LocalClass();
            System.out.println(lc.id);
            lc.wish();
    }
    public static void main(String args[])
    {
        show();
    }
}