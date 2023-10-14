package singleton;
class Singleton
{
    static Singleton obj;
    private Singleton()
    {
        System.out.println("Instance created once");
    }
    public static synchronized Singleton getInstance()
    {
        if(obj==null)
            synchronized(Singleton.class)
            {
                obj = new Singleton();
                return obj;
            }
        return obj;
    }
}
public class SingletonDemo
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                Singleton s1 = Singleton.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                Singleton s2 = Singleton.getInstance();
            }
        });
        
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();

    }
}