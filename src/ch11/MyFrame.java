package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// 실습 안한 것
public class MyFrame extends JFrame {
    int x,y;
    class MyPanel extends JPanel{
        public MyPanel(){
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }
            });
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.ORANGE);
            g.fillRect(x,y,100,100);
        }


    }
    public MyFrame(){
        setTitle("Basic Painting");
        setSize(600,200);
        add(new MyPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        MyFrame f = new MyFrame();
    }
}
