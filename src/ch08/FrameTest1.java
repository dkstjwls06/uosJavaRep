package ch08;

import javax.swing.*;

// Frame 만들기 #1 : JFrame 생성

public class FrameTest1 {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("MyFrame");
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
