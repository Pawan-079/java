package streams;
import java.io.*;
public class ReadFileReader
{
    public static void main(String args[]) throws Exception
    {
        FileReader fr= new FileReader("/home/mallesh/Desktop/Java/b15/favSong.txt"); 
        int data = fr.read();
        while(data!=-1)
        {
            
            System.out.print((char)data);
            data=fr.read();
        }
        //fr.mark(6);
        //System.out.print((char)fr.read());
        fr.close();
    }
}