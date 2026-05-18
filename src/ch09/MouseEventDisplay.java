package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventDisplay extends JFrame {
    private JLabel infoLabel;

    public MouseEventDisplay(){
        setTitle("Mouse Event Display");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        infoLabel = new JLabel("Perform a mouse action...",SwingConstants.CENTER);
        infoLabel.setFont(new Font("Arial", Font.PLAIN,18));
        add(infoLabel, BorderLayout.NORTH);

        JPanel eventPanel = new JPanel();
        eventPanel.setBackground(Color.LIGHT_GRAY);
        add(eventPanel,BorderLayout.CENTER);

        eventPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                infoLabel.setText("Mouse Clicked at ("+e.getX()+", "+e.getY()+")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                infoLabel.setText("Mouse Pressed at ("+e.getX()+", "+e.getY()+")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                infoLabel.setText("Mouse Released at ("+e.getX()+", "+e.getY()+")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                infoLabel.setText("Mouse Entered the panel");
                eventPanel.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                infoLabel.setText("Mouse Exited the panel");
                eventPanel.setBackground(Color.GREEN);
            }
        });

        eventPanel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                infoLabel.setText("Mouse Dragged to ("+e.getX()+", "+e.getY()+")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                infoLabel.setText("Mouse Moved to ("+e.getX()+", "+e.getY()+")");
            }
        });

        eventPanel.addMouseWheelListener(e->{
            int rotation = e.getWheelRotation();
            String direction = (rotation < 0)?"Up":"Down";
            infoLabel.setText("Mouse Wheel Scrolled "+direction);
        });
        setVisible(true);

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new MouseEventDisplay());
    }
}
