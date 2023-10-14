package assignments;
import java.util.Scanner;
public class StrongNumber
{
    public static int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        for(int i=0;i<T;i++)
        {
            int num = read.nextInt();            
            int n=num;
            int sum =0;
            while(num>0)
            {
                sum+=factorial(num%10);
                num/=10;
            }
            if(sum==n)
                System.out.println("Yes");
            else
                System.out.println("No");
        }        
    }
}
