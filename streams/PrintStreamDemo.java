package streams;
import java.io.*;
public class PrintStreamDemo{
    public static void main(String args[]) throws Exception{
        FileOutputStream fos = new FileOutputStream("/home/mallesh/Desktop/Java/b15/userInfo3.txt");
        PrintStream ps = new PrintStream(fos);
        ps.print(1234+" ");
        ps.print('N');
        ps.println("Noida");
        ps.println("hahaha");
        ps.print("hehehe ->");
        ps.print("smile");
        ps.println(23.45f);
        ps.println(1234.5678);
        ps.println(false);
        ps.close();
        fos.close();
    }
}