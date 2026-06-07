package ch09;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

// 수업시간에 실습 안한 것
public class MoveCar3 extends JFrame implements MouseMotionListener{
    int img_x = 150, img_y = 150;
    JButton button;
    JPanel panel; // 소스 구별 및 좌표 변환을 위해 멤버 변수로 승격

    final int BUTTON_WIDTH = 200;
    final int BUTTON_HEIGHT = 100;

    public MoveCar3(){
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("");
        ImageIcon icon = new ImageIcon("car.jpg");
        button.setIcon(icon);

        panel = new JPanel(); // 수정한 부분
        panel.setLayout(null);

        button.setLocation(img_x, img_y);
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT); // 상수로 변경
        panel.add(button);

        panel.addMouseMotionListener(this);
        button.addMouseMotionListener(this);
        add(panel);
        button.setFocusable(false);
        setLocationRelativeTo(null); // 화면 중앙 배치
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        moveButtonToMouse(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        moveButtonToMouse(e);
    }

    // 공통 이동 로직: 이벤트 발생 소스에 따라 좌표를 다르게 계산
    private void moveButtonToMouse(MouseEvent e) {
        if (e.getSource() == button) {
            // 버튼 기준 좌표를 패널 기준 좌표로 변환해 주는 Swing 기능 사용
            MouseEvent convertedEvent = SwingUtilities.convertMouseEvent(button, e, panel);
            img_x = convertedEvent.getX() - (BUTTON_WIDTH / 2);
            img_y = convertedEvent.getY() - (BUTTON_HEIGHT / 2);
        } else {
            // 패널 기준 좌표일 때는 기존 로직 그대로 사용
            img_x = e.getX() - (BUTTON_WIDTH / 2);
            img_y = e.getY() - (BUTTON_HEIGHT / 2);
        }
        button.setLocation(img_x, img_y);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new MoveCar3());
    }
}