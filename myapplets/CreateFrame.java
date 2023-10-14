package myapplets;
import java.awt.*;
import java.awt.event.*;
public class CreateFrame extends Frame
{
    Frame f1;
    Button b1;
    Button b2;
    public CreateFrame()
    {
        f1 = new Frame("Welcome to JavaFrame");
        f1.setLayout(new GridLayout(2,2));
        f1.setSize(200,200);//width,height
        b1 = new Button("Ok");
        b2 = new Button("Cancel");
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
        addWindowListener (new WindowAdapter()
        {
            public void windowClosing (WindowEvent e)
            {
                super.windowClosing(e);
                System.exit(0);
            }    
        });
    }
    public static void main(String[] args)
    {
       CreateFrame f1 = new CreateFrame();       
    }
}