/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapplets;

/**
 *
 * @author mallesh
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondGUI {
    public static void main(String[] args) {
        Abc1 obj = new Abc1();
    }
}
class Abc1 extends JFrame///CardLayout
{
  public Abc1()
  {
     setLayout(new FlowLayout());      
      JLabel l = new JLabel("Hello World");
      JLabel l1 = new JLabel("Welcome Seema");
      add(l);
      add(l1);
      setVisible(true);
      setSize(400,400);
  }
}