package lambda;
/*
@FunctionalInterface
interface Demo
{
    public abstract void wish();
}
public class LambdaDemo
{
    //lambda expression with zero parameters
    public static void main(String args[])
    {
        Demo d = () -> System.out.println("good Evening!!");
        d.wish();
    }
}
*/
/*
@FunctionalInterface
interface Demo
{
    public abstract void multiplier(int i);
}
public class LambdaDemo
{
    //lambda expression with one parameter
    public static void main(String args[])
    {
        Demo d = (int x) -> System.out.println(x*3);
        d.multiplier(4);
    }
}
*/
@FunctionalInterface
interface Demo
{
    public abstract int reminder(int i, int j);
}
public class LambdaDemo
{
    //lambda expression with three parameters
    public static void main(String args[])
    {
        Demo d = (int x, int y) -> 
        {
            int rem = x%y;
            return rem;
        };
                
        int res = d.reminder(5,2);
        System.out.println("Reminder: "+res);
    }
}
