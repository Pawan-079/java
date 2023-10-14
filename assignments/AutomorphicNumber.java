package assignments;
import java.util.Scanner;
public class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        for(int i=0;i<T;i++)
        {
            int num = read.nextInt();            
            int sqr = num*num;
            String flag ="Yes";
            while(num>0)
            {
                if(num%10 != sqr%10)
                {
                    flag = "No";
                    break;
                }
                num /= 10;
                sqr /= 10;
            }
            System.out.println(flag);
        }            
    }
}