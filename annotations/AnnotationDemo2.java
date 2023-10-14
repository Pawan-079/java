package annotations;
@FunctionalInterface
interface Demo
{
    public abstract void show();
}
public class AnnotationDemo2 implements Demo
{
    public void show()
    {
        System.out.println("Show implemented");
    }
    public static void main(String[] args)
    {
        AnnotationDemo2 a = new AnnotationDemo2();
        a.show();        
    }
}
