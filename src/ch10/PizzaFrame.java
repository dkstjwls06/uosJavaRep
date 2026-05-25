package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PizzaFrame extends JFrame {
    private JCheckBox cheese; // 체크 박스
    private JCheckBox pepperoni;
    private JCheckBox mushrooms;
    private JPanel toppingsPanel; // 재료 이미지 표시 패널
    public PizzaFrame() {
        setTitle("피자 재료 선택");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());
// 체크 박스 패널
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new FlowLayout());
// 체크 박스 초기화
        cheese = new JCheckBox("치즈");
        pepperoni = new JCheckBox("페퍼로니");
        mushrooms = new JCheckBox("버섯");

        ActionListener listener = e -> updateToppings();
        cheese.addActionListener(listener);
        pepperoni.addActionListener(listener);
        mushrooms.addActionListener(listener);
// 체크 박스 패널에 추가
        checkBoxPanel.add(cheese);
        checkBoxPanel.add(pepperoni);
        checkBoxPanel.add(mushrooms);
// 재료 이미지 패널
        toppingsPanel = new JPanel();
        toppingsPanel.setLayout(new FlowLayout());
        toppingsPanel.setPreferredSize(new Dimension(500, 300));
        toppingsPanel.setBackground(Color.WHITE); // 배경을 흰색으로 설정
        add(checkBoxPanel, BorderLayout.NORTH);
        add(toppingsPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    private void updateToppings() {
        toppingsPanel.removeAll(); // 기존 이미지 제거
        if (cheese.isSelected()) { // 선택된 재료에 따라 이미지 추가
            JLabel cheeseLabel = new JLabel(new ImageIcon("images/cheese.png"));
            toppingsPanel.add(cheeseLabel);
        }
        if (pepperoni.isSelected()) {
            JLabel pepperoniLabel = new JLabel(new ImageIcon("images/pepperoni.png"));
            toppingsPanel.add(pepperoniLabel);
        }
        if (mushrooms.isSelected()) {
            JLabel mushroomLabel = new JLabel(new ImageIcon("images/mushroom.jpg"));
            toppingsPanel.add(mushroomLabel);
        }
        toppingsPanel.revalidate(); // 패널 새로고침
        toppingsPanel.repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PizzaFrame());
    }

}

