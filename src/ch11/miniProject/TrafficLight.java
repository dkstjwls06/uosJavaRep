package ch11.miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyPanel extends JPanel
        implements ActionListener {
    private int light_number = 0;
    public MyPanel() {
        setLayout(new BorderLayout());
        JButton b = new JButton("신호 변경");
        b.addActionListener(this);
        add(b, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e) {
        if (++light_number >= 3)
            light_number = 0;
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillOval(50,20,100,100);

    }
}
public class TrafficLight extends JFrame{
    public TrafficLight(){
        setTitle("신호등 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyPanel());
        setSize(450,250);
        setVisible(true);

    }
    public static void main(String[] args){new TrafficLight();}



}



