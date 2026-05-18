package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventObjectExample extends JFrame {
    private JButton button;

    public EventObjectExample(){
        setTitle("Event Object Example");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button = new JButton("Click Me!");
        button.addActionListener(new ButtonClickListener());

        add(button);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton sourceButton = (JButton) e.getSource();

            if(sourceButton.getText().equals("Click Me!")){
                sourceButton.setText("클릭되었음");
            } else {
                sourceButton.setText("Click Me!");
            }
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new EventObjectExample());
    }
}
