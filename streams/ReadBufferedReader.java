package streams;
import java.io.*;
public class ReadBufferedReader
{
    public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("/home/mallesh/Desktop/Java/b15/favSong.txt");
        BufferedReader br = new BufferedReader(fr);
        int data = br.read();
        while(data!=-1)
        {
            System.out.print((char)data);
            data = br.read();
        }
        br.close();
        fr.close();
    }
}