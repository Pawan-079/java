package threads;
class Queue2
{
    int n;
    boolean valueSet = false;
    public synchronized void get()
    {
        while(!valueSet)
        {
            try{wait();}catch(Exception e){}
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
    }
    public synchronized void put(int n){
        while(valueSet)
        {
            try{wait();}catch(Exception e){}
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
class Producer implements Runnable{
    Queue2 q;
    Producer(Queue2 q){
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Queue2 q;
    Consumer(Queue2 q){
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
public class ProducerConsumerMechanism {
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}