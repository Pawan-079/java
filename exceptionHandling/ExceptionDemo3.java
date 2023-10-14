package exceptionHandling;
public class ExceptionDemo3 
{
    public static void main(String args[])
    {
        System.out.println("program execution start");
        int fNumber = 8;
        int sNumber = 0;
        int res=0;
        try{
            res=fNumber/sNumber;
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
            throw ae;
        }
        System.out.println("program execution end");
    }
}
