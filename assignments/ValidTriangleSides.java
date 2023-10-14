package assignments;
import java.util.*;
public class ValidTriangleSides
{
    long side1,side2,side3;
    public ValidTriangleSides(long s1, long s2, long s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public String isValid()
    {
        if((this.side1+this.side2)>this.side3 && (this.side1+this.side3)>this.side2 && (this.side2+this.side3)>this.side1)
           return "Yes";
        return "No";
    }
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        for(int i=0;i<T;i++)
        {
            long side1 = read.nextLong();
            long side2 = read.nextLong();
            long side3 = read.nextLong(); 
            ValidTriangleSides obj = new ValidTriangleSides(side1,side2,side3);
            System.out.println(obj.isValid());
        }
    }
}
