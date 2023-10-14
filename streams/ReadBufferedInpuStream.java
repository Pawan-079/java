package streams;
import java.io.*;
public class ReadBufferedInpuStream{
    public static void main(String args[]) throws Exception 
    {
        FileInputStream fis = 
      new FileInputStream("/home/mallesh/Desktop/Java/b15/favSong.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int byteInfo = bis.read();
        while(byteInfo!=-1)
        {
            System.out.print((char)byteInfo+" ");
            byteInfo = bis.read();
        }        
        bis.close();
        fis.close();
    }
}
