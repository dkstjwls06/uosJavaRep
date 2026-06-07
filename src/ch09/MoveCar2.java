package ch09;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 수업시간에 실습 안한 것
public class MoveCar2 extends JFrame {
    int img_x = 150, img_y = 150;
    JButton button;

    public MoveCar2(){
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("");
        ImageIcon icon = new ImageIcon("car.jpg");
        button.setIcon(icon);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        button.setLocation(img_x, img_y);
        button.setSize(200,100);
        panel.add(button);

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                img_x = e.getX();
                img_y = e.getY();
                button.setLocation(img_x,img_y);

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new MoveCar2());
    }
}
