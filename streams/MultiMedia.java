package streams;
import java.io.*;
import java.nio.file.*;
public class MultiMedia{
    public static void main(String args[]) throws Exception{
        Path dir = Paths.get("/home/mallesh/Desktop/Java/b15/media3");
        Path x = Files.createDirectory(dir);
        FileInputStream fis = new FileInputStream("/home/mallesh/Desktop/Java/b15/sampleVideo.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(x+"/copiedMedia.mp4");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int data = bis.read();
        while(data!=-1)
        {
            bos.write(data);
            data=bis.read();
        }
        bis.close();fis.close();bos.close();fos.close();
    }
}