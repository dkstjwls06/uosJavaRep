package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class PizzaToppingCalculator extends JFrame {
    private JLabel priceLabel; // 총 가격을 표시할 라벨
    public PizzaToppingCalculator() {
// 프레임 기본 설정
        setTitle("피자 토핑 계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 150);
        setLayout(new FlowLayout());
// 체크 박스 생성
        JCheckBox cheeseCheckBox = new JCheckBox("치즈 (+1000원)");
        JCheckBox pepperoniCheckBox = new JCheckBox("페퍼로니 (+1500원)");
        JCheckBox mushroomCheckBox = new JCheckBox("버섯 (+1200원)");
// 가격 표시 라벨
        priceLabel = new JLabel("총 가격: 10000원");
        priceLabel.setPreferredSize(new Dimension(350, 30)); // 라벨 크기 설정
// 공통 ItemListener 생성
        ItemListener listener = e -> updatePrice(cheeseCheckBox, pepperoniCheckBox, mushroomCheckBox);
// 리스너 추가
        cheeseCheckBox.addItemListener(listener);
        pepperoniCheckBox.addItemListener(listener);
        mushroomCheckBox.addItemListener(listener);
// 프레임에 컴포넌트 추가
        add(cheeseCheckBox);
        add(pepperoniCheckBox);
        add(mushroomCheckBox);
        add(priceLabel); // 가격 표시 라벨 추가
        setVisible(true);
    }
    // 가격 계산 및 업데이트 메소드
    private void updatePrice(JCheckBox cheese, JCheckBox pepperoni, JCheckBox mushroom) {int totalPrice = 10000;
        if (cheese.isSelected()) totalPrice += 1000;
        if (pepperoni.isSelected()) totalPrice += 1500;
        if (mushroom.isSelected()) totalPrice += 1200;
        priceLabel.setText("총 가격: " + totalPrice + "원");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PizzaToppingCalculator());
    }
}