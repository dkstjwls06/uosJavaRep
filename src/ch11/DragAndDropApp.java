package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragAndDropApp extends JFrame {
    private class MyPanel extends JPanel{
        private int rectX = 100, rectY = 100;
        private int rectWidth = 100, rectHeight = 100;
        private boolean dragging = false;
        private int offsetX, offsetY;

        public MyPanel(){
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if(e.getX() >= rectX && e.getX() <= rectX+rectWidth && e.getY() >= rectY && e.getY() <= rectY + rectHeight){
                        dragging = true;
                        offsetX = e.getX() - rectX;
                        offsetY = e.getY() - rectY;
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    dragging = false;
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    if(dragging){
                        rectX = e.getX() - offsetX;
                        rectY = e.getY() - offsetY;
                        repaint();
                    }
                }
            });
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.WHITE);
            g.fillRect(0,0,getWidth(),getHeight());

            g.setColor(Color.BLUE);
            g.fillRect(rectX, rectY,rectWidth,rectHeight);

        }
    }

    public DragAndDropApp(){
        setTitle("Drag and Drop Rectangle");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new MyPanel());
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new DragAndDropApp());
    }
}
