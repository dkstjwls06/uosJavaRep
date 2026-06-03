// 중요 - 수업시간 실습한 예제

package ch08;

import javax.swing.*;

public class PizzaOrderApp extends JFrame {
    public PizzaOrderApp(){
        setSize(600,150);
        setTitle("PizzaOrderApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panelA.add(new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오."));

        panelB.add(new JButton("콤보피자"));
        panelB.add(new JButton("포테이토피자"));
        panelB.add(new JButton("불고기피자"));
        panelB.add(new JLabel("개수"));
        panelB.add(new JTextField(10));

        panel.add(panelA);
        panel.add(panelB);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new PizzaOrderApp());
    }
}
