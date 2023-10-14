package wrapperclasses;

public class PassByValueReference
{
    int num=10;
    public void modify(PassByValueReference p)
    {
        this.num=num*2;
    }
    public int get()
    {
        return this.num;
    }
    public static void main(String[] args)
    {
        PassByValueReference obj = new PassByValueReference();
        System.out.println(obj.num);
        obj.modify(obj);
        System.out.println("Modifed num: "+obj.num);
    }
}
