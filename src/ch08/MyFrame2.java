package ch08;

// 프레임에 버튼 추가하기
import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    public MyFrame2(){
        setTitle("MyFrame2");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);

    }

    public static void main(String[] args){ SwingUtilities.invokeLater(()->new MyFrame2());}
}
