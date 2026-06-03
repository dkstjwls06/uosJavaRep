package ch08;

import javax.swing.*;
import javax.swing.text.IconView;

public class TempConvertor extends JFrame {
    public TempConvertor(){
        setTitle("온도변환기");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JLabel ftemp = new JLabel("화씨 온도");
        JTextField farenheidt = new JTextField(20);
        JLabel ctemp = new JLabel("섭씨 온도");
        JTextField celcius = new JTextField(20);

        panel.add(ftemp);
        panel.add(farenheidt);
        panel.add(ctemp);
        panel.add(celcius);

        JButton convert = new JButton("변환");
        panel.add(convert);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new TempConvertor());
    }
}
