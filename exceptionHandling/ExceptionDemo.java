/*example for StackTrace()*/
package exceptionHandling;
public class ExceptionDemo
{
    public static void method2()
    {
        int fNumber = 8;
        int sNumber = 0;
        int res=0;
        res=fNumber/sNumber;
    }
    public static void method1()
    {
        method2();
    }
    public static void main(String args[])
    {
        System.out.println("program execution start");
        method1();
        System.out.println("program execution end");
    }
    /**StackTrace()
     * exception name
     * exception message
     * line number
     * method info
     */
}
