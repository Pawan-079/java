package assignments;
import java.util.*;
public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        for(int i=0;i<T;i++)
        {
            int num = read.nextInt();
            int rev =0;
            while(num!=0)
            {
                rev = (rev*10)+num%10;
                num/=10;
            }
            System.out.println(rev);
        }
    }
}