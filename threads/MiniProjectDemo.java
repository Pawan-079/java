/*
Create a Mini Project to copy all Files of type Photo , Sound , Video and Character  in a Directory 
using 4 threads .

In thread one copy Photos
In thread two copy sound Files
In thread three copy Video Files 
In thread four copy Character Files
*/
package threads;
import java.io.*;
class MiniProject
{
    private String sourceDir;
    private String destinationDir;

    //Constructor to Initialize the Directories variable
    public  MiniProject(String sourceDir, String destinationDir)
    {
        this.sourceDir = sourceDir;
        this.destinationDir = destinationDir;
    }

    // Method to get All File Names in a Directory
    File[] readAllFilesInDir()
    {
        File f1 = new File(sourceDir);
        File[] files =null;
        if(f1.isDirectory()){
             files = f1.listFiles();
        }
       return files;
    }

    // copy to File to File
    void getFileName() throws Exception
    {
       File[]  files = readAllFilesInDir();
       for(File file :  files){
           System.out.println(file.getAbsolutePath());
           System.out.println(file.getName());
          // copyFile(file.getAbsolutePath());
           copyFile(file);
       }
    }
    void copyFile(File  file) throws Exception
    {
        FileInputStream fin= new FileInputStream(file.getAbsolutePath());
        BufferedInputStream bis = new BufferedInputStream(fin);

        FileOutputStream fos = new FileOutputStream(destinationDir+"\\"+file.getName());
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int i;
        while((i=bis.read())!=-1)
        {
            bos.write(i);
        }

        bos.flush();
        bos.close();
        fos.close();
        bis.close();
        fin.close();
    }
}
public class MiniProjectDemo
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(()->
                {
                    MiniProject miniPro = new MiniProject("","");
                    try
                    {
                        miniPro.getFileName();
                    }
                    catch (Exception e)
                    {
                        throw new RuntimeException(e);
                    }
                }
        );
        t1.start();
    }
}