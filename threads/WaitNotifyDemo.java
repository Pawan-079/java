package threads;
class TotalEarnings implements Runnable
{
    int total;
    public void run()
    {
        synchronized(this)
        {
            for(int i=0;i<100;i++)
            {
                total = total + 250;
            }
            this.notify();
        }
    }
}
public class WaitNotifyDemo
{
    public static void main(String[] args) throws Exception
    {
        TotalEarnings te = new TotalEarnings();
        Thread t1 = new Thread(te);
        t1.start();
        synchronized(t1)
        {
            t1.wait();
            System.out.println("Total : Rs. "+te.total);
        }
    }
}
