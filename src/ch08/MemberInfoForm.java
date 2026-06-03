package ch08;

import javax.swing.*;
import java.awt.*;

public class MemberInfoForm extends JFrame {
    public MemberInfoForm(){
        setTitle("회원 정보 입력");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(5,2,10, 10));
        panel.add(new JLabel("이름:")); panel.add(new JTextField());
        panel.add(new JLabel("이메일:")); panel.add(new JTextField());
        panel.add(new JLabel("전화번호:")); panel.add(new JTextField());
        panel.add(new JLabel("비밀번호:")); panel.add(new JPasswordField());
        panel.add(new JButton("확인"));
        panel.add(new JButton("취소"));
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new MemberInfoForm());
    }
}
