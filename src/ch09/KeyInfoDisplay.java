package ch09;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInfoDisplay extends JFrame {
    private JLabel label;
    public KeyInfoDisplay(){
        setTitle("Key Info Display");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("<html>키를 누르면 정보가 출력됩니다.<br><br></html>", SwingConstants.CENTER);
        label.setBounds(10,10,260,150);
        add(label);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String keyName = KeyEvent.getKeyText(e.getKeyCode());
                int keyCode = e.getKeyCode();
                char keyChar = e.getKeyChar();
                boolean isActionKey = e.isActionKey();

                String info = String.format("<html>키 정보:<br>"+"Key name: %s<br>"+"Key Code: %d<br>"+ "Key Char: %c<br>"+"Is Action Key: %b<br></html>",keyName,keyCode, keyChar, isActionKey);
                label.setText(info);

            }
        });

        setVisible(true);
        setFocusable(true);
        requestFocus();

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new KeyInfoDisplay());
    }
}
