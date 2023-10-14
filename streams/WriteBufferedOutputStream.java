package streams;
import java.io.*;
import java.util.Scanner;
public class WriteBufferedOutputStream
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("/home/mallesh/Desktop/Java/b15/userInfo.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any information to write into file:");
        for(int i=0;i<5;i++)
        {
            String str1 = read.nextLine();
            byte[] bytes1 = str1.getBytes();
            fos.write(bytes1);
            fos.write("\n".getBytes());
        }
        fos.close();

    }
}
