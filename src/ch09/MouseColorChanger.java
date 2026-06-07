package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

// 실습 안한 파일
public class MouseColorChanger extends JFrame {
    private final Random random = new Random();

    public MouseColorChanger(){
        setTitle("클릭으로 색깔 바꾸기");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(new Color(
                        random.nextInt(256),
                        random.nextInt(256),
                        random.nextInt(256)
                ));
            }
        });

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new MouseColorChanger());
    }

}
