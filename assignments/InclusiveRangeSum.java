package assignments;
import java.util.*;
public class InclusiveRangeSum
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=read.nextInt();
        }
        int T = read.nextInt();//2
        for(int j=0;j<T;j++)
        {
            int start = read.nextInt();
            int end = read.nextInt();
            int sum=0;
            for(int k=start;k<=end;k++)
            {
                sum+=arr[k];
            }
            System.out.println(sum);
        }
//
//        while(T>0)
//        {
//            int start = read.nextInt();
//            int end = read.nextInt();
//            int sum=0;
//            for(int k=start;k<=end;k++)
//            {
//                sum+=arr[k];
//            }
//            System.out.println(sum);
//            T-=1;
//        }
    }
}
