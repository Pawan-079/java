package threads;

class Hi implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {Thread.sleep(500);} catch (InterruptedException ex) {}
            System.out.println("Hi");
        }
    }
}
class Hello implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {Thread.sleep(500);} catch (InterruptedException ex) {}
            System.out.println("Hello");
        }
    }
}
public class RunnableDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();
        Thread t1 = new Thread(obj1);
        System.out.println(t1.getState());
        Thread t2 = new Thread(obj2);
        t1.start();
        System.out.println(t1.getState());
        t1.join();
        t2.start();
    }
}