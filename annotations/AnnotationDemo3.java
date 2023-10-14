package annotations;
class Demo2
{
    @Deprecated
    public int sum(int a, int b)
    {
        return a+b;
    }
}
public class AnnotationDemo3
{
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        Demo2 d = new Demo2();
        System.out.println("Sum: "+d.sum(23,45));
    }
}
