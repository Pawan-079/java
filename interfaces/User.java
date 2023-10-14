package interfaces;

public class User {
    public static void main(String args[])
    {
        Asus asus = new Asus();
        asus.copy();
        asus.paste();
        asus.cut();
        asus.keyboard();

        MacBook mb = new MacBook();
        mb.copy();
        mb.paste();
        mb.cut();
        mb.keyboard();

        Dell dell = new Dell();
        dell.copy();
        dell.paste();
        dell.cut();
        dell.keyboard();
    }
}
