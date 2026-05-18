package ch08.miniProject;

import javax.swing.*;
import java.awt.*;

public class TVRemote extends JFrame {
    public TVRemote(){
        setTitle("가상 TV 리모컨");
        setSize(250,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3,1,5,5));

        JButton powerBtn = new JButton("전원");
        powerBtn.setBackground(Color.RED);
        powerBtn.setForeground(Color.YELLOW);
//        powerBtn.setFont(new Font("Arial",Font.BOLD,16));
        JPanel powerPanel = new JPanel();
        powerPanel.add(powerBtn);
        topPanel.add(powerPanel);

        JPanel volumePanel = new JPanel(new FlowLayout());
        JButton volUp = new JButton("볼륨 UP");
        JButton volDown = new JButton("볼륨 DOWN");
        volUp.setBackground(Color.GREEN);
        volDown.setBackground(Color.GREEN);
        volumePanel.add(volUp);
        volumePanel.add(volDown);
        topPanel.add(volumePanel);

        JPanel channelPanel = new JPanel(new FlowLayout());
        JButton chUp = new JButton("채널 UP");
        JButton chDown = new JButton("채널 DOWN");
        chUp.setBackground(Color.WHITE);
        chDown.setBackground(Color.WHITE);
        channelPanel.add(chUp);
        channelPanel.add(chDown);
        topPanel.add(channelPanel);

        add(topPanel, BorderLayout.NORTH);

        JPanel numberPanel = new JPanel(new GridLayout(4,3,5,3)); // 3?

        String[] strs = {"1","2","3","4","5","6","7","8","9","0"};
        for (String str : strs) {
            JButton btn = new JButton(str);
            btn.setBackground(new Color(255, 200, 50));
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            numberPanel.add(btn);
        }

        add(numberPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new TVRemote());
    }

}
