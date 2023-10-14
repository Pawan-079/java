package myapplets;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Addition extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JButton b1;
    JLabel l1,l2;
    public Addition()
    {
        t1 = new JTextField(5);  
        t2 = new JTextField(5);  
        l1 = new JLabel("+");
        b1 = new JButton("SUM");
        l2 = new JLabel("Result");
        add(t1);
        add(l1);
        add(t2);
        add(b1);
        add(l2);
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
       int num1 = Integer.parseInt(t1.getText());
       int num2 = Integer.parseInt(t2.getText());
       int value = num1+num2;
       l2.setText(Integer.toString(value));
    }
}
public class AddTwoNumbersGUI
{    
    public static void main(String[] args)
    {
        Addition obj = new Addition();
    }
}