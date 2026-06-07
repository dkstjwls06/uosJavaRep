// 수업땐 안 한것.
package ch09;

import ch08.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColor extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListener listener = new MyListener();

    public ChangeColor(){
        setTitle("이벤트 예제");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(listener);
        panel.add(button1);
        button2 = new JButton("핑크색");
        button2.addActionListener(listener);
        panel.add(button2);

        add(panel);
        setVisible(true);
    }

    private class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == button1){
                panel.setBackground(Color.YELLOW);
            }else if(e.getSource() == button2){
                panel.setBackground(Color.PINK);
            }
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new ChangeColor());
    }
}
