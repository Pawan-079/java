package streams;
import java.io.*;
public class WriteBufferedWriter
{
    public static void main(String args[]) throws Exception
    {
        FileWriter fw = new FileWriter("/home/mallesh/Desktop/Java/b15/newFile2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("This is going to write inside the file");
        bw.append("This text will append in file");
        bw.close();
        fw.close();
    }
}
