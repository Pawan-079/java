package myapplets;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.PopupMenu;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MFrame extends Frame
{
    Frame f1;
    Label l1;
    Label l2;
    Button b;
    
    MFrame()
    {
        f1 = new Frame("This is new AWT");
        l1= new Label("One");
        l2 = new Label("Two");
        b = new Button("Click Here");
        f1.setLayout(new GridLayout(3,1));
        f1.setVisible(true);
        f1.add(l1);
        f1.add(l2);
        f1.add(b);
        f1.setSize(400,400);
        
        f1.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}
public class GUIawt {    
    public static void main(String[] args) {
        MFrame obj = new MFrame();
    }
}