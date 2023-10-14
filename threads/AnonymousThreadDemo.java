package threads;
public class AnonymousThreadDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable obj1 = new Hi()
        {
            public void run()
            {
                for(int i=0;i<10;i++)
                {
                    try {Thread.sleep(500);} catch (InterruptedException ex) {}
                    System.out.println("Hi");
                }
            }
            
        };
        Runnable obj2 = new Hello()
        {
            public void run()
            {
                for(int i=0;i<10;i++)
                {
                    try {Thread.sleep(500);} catch (InterruptedException ex) {}
                    System.out.println("Hello");
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        t1.join();
        t2.start();
    }
}
