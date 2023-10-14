package streams;
import java.io.*;
import java.util.Scanner;

public class SecretCommunication
{
    public static void main(String args[]) throws Exception
    {
        //Encryption
        FileOutputStream fos = new FileOutputStream("/home/mallesh/Desktop/Java/b15/secret.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        Scanner read = new Scanner(System.in);
        System.out.println("Enter secret information to encrypt into file:");
        String str = read.nextLine();
        System.out.println("Enter encryption code:");
        int code = read.nextInt();

        byte[] bytes = str.getBytes();
        for(int i=0;i<bytes.length;i++)
        {
            bytes[i]=(byte) (bytes[i]+code);
        }
        bos.write(bytes);
        bos.close();
        fos.close();

        //Decryption
        FileInputStream fis = new FileInputStream("/home/mallesh/Desktop/Java/b15/secret.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        int byteInfo = bis.read();
        while(byteInfo != -1)
        {
            System.out.print((char)(byteInfo-code));
            byteInfo=bis.read();
        }
        bis.close();
        fis.close();

    }
}