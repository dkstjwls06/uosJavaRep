package ch09;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Button has been clicked!");
    }
}

public class ButtonEvent extends JFrame{
    public ButtonEvent(){
        setTitle("Button Event Example");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me!");
        button.addActionListener(new MyListener());

        add(button);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new ButtonEvent());
    }
}