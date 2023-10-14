package exceptionHandling;
class ExceptionDemo4 
{
    static void fun() throws ArithmeticException
    {
        int a=9;
        int b=0;
        int res=a/b;
        System.out.println("Inside fun(). ");
        throw new ArithmeticException("demo");
    }
 
    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (ArithmeticException e) {
            System.out.println("caught in main.");
        }
    }
}