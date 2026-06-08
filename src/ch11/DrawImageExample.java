package ch11;

import javax.swing.*;
import java.awt.*;

// 실습 안한 거
public class DrawImageExample extends JFrame {
    private class MyPanel extends JPanel{
        private Image image;

        public MyPanel(){
            ImageIcon icon = new ImageIcon("car.jpg");
            image = icon.getImage();
        }

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            g.drawImage(image,0,0,this);
            g.drawString("원본",50,120);

            g.drawImage(image,300,0,500,200,this);
            g.drawString("확대",310,220);
        }


    }
    public DrawImageExample(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,300);
        add(new MyPanel());
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new DrawImageExample());
    }
}
