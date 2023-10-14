package exceptionHandling;
public class ExceptionDemo2 
{
    public static void method1()
    {
        int fNumber = 8;
        int sNumber = 0;
        int res=0;
        try{
            res=fNumber/sNumber;
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
    }
    public static void method2()
    {
        String str1=null;
        String str2="niet";
        try{
            if(str1.equals(str2))
            {
                System.out.println("TRUE");
            }
        }
        catch(NullPointerException npe)
        {
            System.out.println(npe.getMessage());
        }
    }
    public static void method3()
    {
        int[] arr = {0,1,2,3,4};
        try{
            for(int i=0;i<=arr.length;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
        catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println(aiobe.getMessage());
        }
    }
    public static void main(String args[])
    {
        System.out.println("program execution start");
        method1();
        method2();
        method3();
        System.out.println("program execution end");
    }
}
