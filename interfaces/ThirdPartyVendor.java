package interfaces;
public abstract class ThirdPartyVendor implements Laptop
{
    public void keyboard()
    {
        System.out.println("ThirdPartyVendor keyboard code");
    }
    public void cut()
    {
        System.out.println("ThirdPartyVendor cut code");
    }
    public abstract void copy();
    public abstract void paste();
}