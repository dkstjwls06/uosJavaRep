package ch08;

import javax.swing.*;
import java.awt.*;

public class MyFrame4 extends JFrame {
    public MyFrame4(){
        setTitle("MyFrame4");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args){SwingUtilities.invokeLater(()-> new MyFrame4());}
}
