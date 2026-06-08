package ch11;

import javax.swing.*;
import java.awt.*;

// 실습 안한 것
public class BasicPainting extends JFrame {
    private class MyPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            g.drawOval(60,50,60,60);
            g.drawRect(120,50,60,60);

            g.setColor(Color.BLUE);
            g.fillOval(180,50,60,60);
            g.fillRect(240,50,60,60);
        }
    }

    public BasicPainting(){
        setTitle("Basic Painting");
        setSize(600,200);
        add(new MyPanel());
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new BasicPainting());
    }
}
