package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Button was clicked!");
    }
}

public class ButtonEvent extends JFrame {
    public ButtonEvent(){
        setTitle("Button Event Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);

        JButton button = new JButton("Click me!");
        button.addActionListener(new MyListener());
        add(button);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new ButtonEvent());
    }
}
