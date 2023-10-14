package myapplets;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class CreateFrameSwing
{    
    public static void main(String[] args)
    {
        Abc obj = new Abc();
    }
}
class Abc extends JFrame
{
  public Abc()
  {
      //To Show Something
      JLabel l = new JLabel("Hello World");
      //Add label on frame
      add(l);
      setVisible(true);
      setSize(400,400);
  }
}