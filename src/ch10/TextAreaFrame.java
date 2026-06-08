package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaFrame extends JFrame implements ActionListener {
    protected JTextField textField;
    protected JTextArea textArea;

    public TextAreaFrame(){
        setTitle("Text Area Test");
        textField = new JTextField(30);
        textField.addActionListener(this);
        textArea = new JTextArea(6,30);
        textArea.setEditable(false);
        add(textField, BorderLayout.NORTH);
        add(textField,BorderLayout.CENTER);

        pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        String text = textField.getText();
        textArea.append(text + "\n");
        textField.selectAll();
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    public static void main(String[] args ){SwingUtilities.invokeLater(()->new TextAreaFrame());}
}
