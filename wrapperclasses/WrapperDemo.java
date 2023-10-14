package wrapperclasses;
public class WrapperDemo
{
    public static void main(String[] args)
    {
        int num =10;
        Integer i = new Integer(10);//Boxing

        Integer i2 = num;   //AutoBoxing
        
        System.out.println("Primitive datatype: "+num);
        System.out.println("Boxed value: "+i);
        System.out.println("AutoBoxed value: "+i2);
        
        int num2 = i.intValue();//Unboxing
        System.out.println("Unboxed value: "+num2);
    }
}
