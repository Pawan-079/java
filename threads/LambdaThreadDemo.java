package threads;
public class LambdaThreadDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable obj1 = ()->
            {
                for(int i=0;i<10;i++)
                {
                    try {Thread.sleep(500);} catch (InterruptedException ex) {}
                    System.out.println("Hi");
                }
            };
        Runnable obj2 = ()->
            {
                for(int i=0;i<10;i++)
                {
                    try {Thread.sleep(500);} catch (InterruptedException ex) {}
                    System.out.println("Hello");
                }
            };

        Thread t1 = new Thread(obj1);
        System.out.println("Current State of Thread: "+t1.getState());
        Thread t2 = new Thread(obj2);
        t1.start();
        System.out.println("Current State of Thread: "+t1.getState());
        t1.join();
        t2.start();
    }
}
