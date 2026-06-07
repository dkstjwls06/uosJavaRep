// 수업땐 안 한것.
package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad extends JFrame {
    private JPanel numberPanel;
    private JTextField textField;
    private JButton[] numberButton = new JButton[9];

    public KeyPad(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyButtonListener listener = new MyButtonListener();

        textField = new JTextField(20);
        textField.setEnabled(false);

        numberPanel = new JPanel(new GridLayout(3,3));
        for(int i = 0; i < 9; i++){
            numberButton[i] = new JButton(Integer.toString(i+1));
            numberButton[i].addActionListener(listener);
            numberButton[i].setPreferredSize(new Dimension(100,30));
            numberPanel.add(numberButton[i]);
        }
        add(textField, BorderLayout.NORTH);
        add(numberPanel, BorderLayout.CENTER);


        pack();
        setVisible(true);
    }

    private class MyButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton sourceButton = (JButton) e.getSource();
            String val = sourceButton.getText();
            textField.setText(textField.getText() + val);
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new KeyPad());
    }
}
