package ch10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageViewer extends JFrame implements ActionListener {
    private JLabel label; // 이미지를 표시할 레이블
    private JMenuItem open, exit; // 메뉴 항목: ‘Open’과 ‘Exit’
    public ImageViewer() {
        setTitle("ImageViewer"); // 창 제목 설정
        setSize(350, 300); // 창 크기 설정
// 메뉴바 생성 및 설정
        JMenuBar mbar = new JMenuBar(); // 메뉴바 생성
        JMenu m = new JMenu("File"); // ‘File’ 메뉴 생성
        open = new JMenuItem("Open");
        open.addActionListener(this);
        m.add(open); // ‘File’ 메뉴에 ‘Open’ 추가
        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        m.add(exit); // ‘File’ 메뉴에 ‘Exit’ 추가
        mbar.add(m); // 메뉴바에 ‘File’ 메뉴 추가
        setJMenuBar(mbar); // 창에 메뉴바 설정
        label = new JLabel(); // 이미지를 표시할 빈 레이블 생성
        JPanel panel = new JPanel(); // 패널 생성
        panel.add(label, "Center"); // 레이블을 패널 중앙에 추가
        add(panel); // 패널을 프레임에 추가
        setVisible(true); // 창을 화면에 표시
    }
    // ActionListener 인터페이스의 메소드 구현
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // 이벤트가 발생한 소스 객체 확인
        if (source == open) { // ‘Open’ 메뉴 항목이 클릭된 경우
            JFileChooser chooser = new JFileChooser(); // 파일 선택 대화 상자 생성
            int r = chooser.showOpenDialog(this); // 파일 선택 대화 상자 표시
// 사용자가 파일을 선택한 경우
            if (r == JFileChooser.APPROVE_OPTION) {
                String name = chooser.getSelectedFile().getAbsolutePath(); // 선택된 파일 경로 가져오기
                label.setIcon(new ImageIcon(name)); // 선택된 파일의 이미지를 레이블에 표시
            }
        }
        else if (source == exit) { // ‘Exit’ 메뉴 항목이 클릭된 경우
            System.exit(0); // 프로그램 종료
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageViewer());
    }
}