package ch08;

import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {
    public MyFrame3(){
        setTitle("MyFrame3");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(200,300);

        setLayout(new FlowLayout());
        // setBackground(Color.green);
        getContentPane().setBackground(Color.yellow);
        // Java 5 이후부터는 add(), remove(), setLayout() 등이 getContentPane() 명시 필요 없어짐.
        // 단, 여전히 ContentPane을 직접 설정하거나 하는 경우가 있음.
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        add(button1);
        add(button2);
        setVisible(true);

    }
    public static void main(String[] args){SwingUtilities.invokeLater(()-> new MyFrame3());}
}
