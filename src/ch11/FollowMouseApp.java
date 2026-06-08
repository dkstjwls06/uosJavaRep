package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

// 추가로 해보라고 했던 거
public class FollowMouseApp extends JFrame {
    private class MyPanel extends JPanel implements MouseMotionListener{
        private int x = -50, y = -50;

        public MyPanel(){
            addMouseMotionListener(this);
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillOval(x-25,y-25,50,50);

        }

        @Override
        public void mouseMoved(MouseEvent e){
            x = e.getX();
            y = e.getY();
            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {}
    }
    public FollowMouseApp(){
        setTitle("Follow the Mouse");
        add(new MyPanel());
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new FollowMouseApp());
    }
}
