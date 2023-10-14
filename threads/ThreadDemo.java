package threads;
class A extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++)
        {
            System.out.println("A");
            try {Thread.sleep(500);} catch (InterruptedException ex) {}
        }
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int j=0;j<5;j++)
        {
            System.out.println("B");
            try {Thread.sleep(200);} catch (InterruptedException ex) {}
        }
    }
}
public class ThreadDemo
{
    public static void main(String args[]) throws InterruptedException
    {
        //System.out.println(Thread.currentThread().getName());
        Thread obj1 = new A();
        Thread obj2 = new B();
        obj1.start();
        obj1.join();
        obj2.start();
    }
}