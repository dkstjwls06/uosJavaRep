package ch11;

import javax.swing.*;
import java.awt.*;

public class DrawShapes1Test extends JFrame {
    private class MyPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            Dimension d = getSize();
            int gWidth = d.width / 7;
            int gHeight = d.height;

            int x = 5, y = 5;
            int width = gWidth - 10, height = gHeight - 10;

            g.drawLine(x,y+height - 1, x+width,y);
            x+= gWidth;

            g.setColor(Color.BLACK);
            g.drawRect(x,y,width,height);
            x += gWidth;

            g.setColor(Color.LIGHT_GRAY);
            g.draw3DRect(x,y,width,height,true);
            x+=gWidth;
            g.setColor(Color.BLACK);

            g.drawRoundRect(x,y,width,height,20,20);
            x += gWidth;

            g.drawOval(x,y,width,height);
            x += gWidth;

            g.drawArc(x,y,width,height,90,150);
            x+=gWidth;

            int[] xp = {x,x+30,x+80, x+90};
            int[] yp = {y,y+80, y+30, y+50};
            g.drawPolygon(xp,yp,xp.length);

        }
    }
    public DrawShapes1Test(){
        setTitle("MyFrame");
        setSize(700,180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new MyPanel());
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new DrawShapes1Test());
    }
}
