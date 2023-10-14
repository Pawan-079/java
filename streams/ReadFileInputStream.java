package streams;
import java.io.FileInputStream;
public class ReadFileInputStream
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("/home/mallesh/Desktop/Java/b15/favSong.txt");
        int byteInfo = fis.read();
        while(byteInfo!=-1)
        {
            System.out.print((char)byteInfo+" ");
            byteInfo = fis.read();
        }
        
        fis.close();
    }
}
