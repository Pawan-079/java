package streams;
import java.io.PrintWriter;
public class WritePrintWriter
{
    public static void main(String args[]) throws Exception
    {
        PrintWriter pw = new PrintWriter("/home/mallesh/Desktop/Java/b15/userInfo4.txt");
        pw.println("Welcome");
        pw.print(" to NIET.");
        pw.println(1234);
        pw.print("good evenig!!");
        pw.append("Good students!!!");
        pw.flush();
        pw.close();
    }
}