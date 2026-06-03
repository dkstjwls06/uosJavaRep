package ch08;

import javax.swing.*;
import java.awt.*;

public class PianoKeys extends JFrame {
    public PianoKeys(){
        setTitle("Piano Keys Layout");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton[] whiteKeys = new JButton[7];
        JButton[] blackKeys = new JButton[5];

        for(int i=0; i < whiteKeys.length;i++){
            whiteKeys[i] = new JButton();
            whiteKeys[i].setBackground(Color.WHITE);
            whiteKeys[i].setBounds(i*(50+10),50,50,150);
            add(whiteKeys[i]);
        }

        for(int i=0; i<blackKeys.length; i++){
            blackKeys[i] = new JButton();
            blackKeys[i].setBackground(Color.BLACK);
            int blackKeyX = (i * (50 + 10)) + (3*50 / 4);
            blackKeys[i].setBounds(blackKeyX,50,30,100);
            add(blackKeys[i]);
        }

        setVisible(true);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new PianoKeys());
    }
}
