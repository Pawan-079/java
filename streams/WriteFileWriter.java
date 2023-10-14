package streams;
import java.io.*;
public class WriteFileWriter
{
    public static void main(String args[]) throws Exception
    {
        FileWriter fw = new FileWriter("/home/mallesh/Desktop/Java/b15/newFile.txt");
        String str = "This is a string";
        String str1 = "\nThis is a portion of string ";
        fw.write(str1,11,7);
        fw.write(str);
        fw.append("This is going to append in the file");
        fw.close();
    }
}
