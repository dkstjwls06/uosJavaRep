package ch10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTest extends JFrame {
    public MenuTest(){
        setTitle("메뉴 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenu editMenu = new JMenu("편집");

        JMenuItem openItem = new JMenuItem("열기");
        JMenuItem saveItem = new JMenuItem("저장");
        JMenuItem exitItem = new JMenuItem("종료");

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuTest.this, "열기 선택됨");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuTest.this,"저장 선택됨");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(
                        MenuTest.this,
                        "정말 종료하시겠습니까?",
                        "종료 확인",
                        JOptionPane.YES_NO_OPTION
                );
                if(response == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);
        setVisible(true);

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new MenuTest());
    }
}
