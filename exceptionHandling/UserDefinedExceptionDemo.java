/*demonstration of user defined exception*/

package exceptionHandling;
class UserDefinedException extends Exception
{
    public UserDefinedException(String msg)
    {
        super(msg);
    }
    public String getMessage(String msg)
    {
        return msg;
    }
}

public class UserDefinedExceptionDemo
{
    public static void main(String args[])
    {
        try{
            throw new UserDefinedException("This is user defined Exception");
        }
        catch(UserDefinedException ude)
        {
            System.out.println(ude.getMessage());
        }
    }
}
