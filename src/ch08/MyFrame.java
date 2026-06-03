package ch08;

// 프레임 만들기 #2 : JFrame 상속

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("MyFrame");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new MyFrame());
    }
}
