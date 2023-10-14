package streams;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class WriteDataOutputStream{
    public static void main(String args[]) throws Exception{
        FileOutputStream fos = new FileOutputStream("/home/mallesh/Desktop/Java/b15/userInfo2.txt");
        DataOutputStream dos = new DataOutputStream(fos);        
        dos.writeInt(12);
        dos.writeChar('A');
        dos.writeChars("niet");
        dos.writeLong(123456);
        dos.writeDouble(123.456);
        dos.writeShort(23);
        dos.writeByte(98);

        dos.flush();
        fos.flush();
        dos.close();
        fos.close();
    }
}