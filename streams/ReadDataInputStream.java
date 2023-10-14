package streams;
import java.io.DataInputStream;
import java.io.FileInputStream;
public class ReadDataInputStream{
    public static void main(String args[]) throws Exception{
        FileInputStream fis = new FileInputStream("/home/mallesh/Desktop/Java/b15/userInfo.txt");
        DataInputStream dis = new DataInputStream(fis);
        int intData = dis.readInt();
        char charData = dis.readChar();
        double doubleData = dis.readDouble();
        short shortData =dis.readShort();
        boolean boolData = dis.readBoolean();
        System.out.println("Int Data: "+intData);
        System.out.println("Char Data: "+charData);
        System.out.println("Doubble Data: "+doubleData);
        System.out.println("Short Data: "+shortData);
        System.out.println("Boolean Data: "+boolData);
        
        dis.close();
        fis.close();
        
    }
}
