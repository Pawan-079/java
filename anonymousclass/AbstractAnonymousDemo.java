package anonymousclass;
abstract class Demo{
    public abstract void display();
}
public class AbstractAnonymousDemo{
    public static void main(String args[])
    {
        Demo d = new Demo()
        {
            public void display()
            {
                System.out.println("display in anonymous");
            }
        };
        d.display();
    }
}