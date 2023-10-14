package threads;
import java.io.*;

public class StreamsThreadDemo
{
    private String sourceFile;
    private String destinationFile;
    public StreamsThreadDemo(String sourceFile,String destinationFile)
    {
        this.sourceFile=sourceFile;
        this.destinationFile=destinationFile;
    }

    void copyFile() throws IOException
    {
        FileInputStream fr = new FileInputStream(sourceFile);
        BufferedInputStream br = new BufferedInputStream(fr);
        FileOutputStream fw = new FileOutputStream(destinationFile);
        BufferedOutputStream bw = new BufferedOutputStream(fw);
        int i;
        while((i=br.read())!=-1)
        {
            bw.write(i);
        }
        bw.flush();
        bw.close();
        fw.close();
        fr.close();
        br.close();
    }
    public static void main(String[] args) throws IOException
    {
        Thread t1 = new Thread(()->{
        StreamsThreadDemo f1 = new StreamsThreadDemo("/home/mallesh/Desktop/Java/b15/favSong2.txt","/home/mallesh/Desktop/Java/b15/media/copiedText2.txt");
        try
        {
            f1.copyFile();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        });
        t1.start();

        
        Thread t2 = new Thread(()->{
            StreamsThreadDemo f1 = new StreamsThreadDemo("/home/mallesh/Desktop/Java/b15/favSong.txt","/home/mallesh/Desktop/Java/b15/media/copiedText.txt");
            try {
                f1.copyFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        
        t2.start();
    }
}