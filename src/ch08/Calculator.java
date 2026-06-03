package ch08;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JPanel panel;
    private JTextField tField;
    private JButton[] buttons;
    private String[] labels = {
            "Backspace","","","CE","C",
            "7","8","9","/","sqrt",
            "4","5","6","x","%",
            "1","2","3","-","1/x",
            "0","+/-",".","+","="
    };

    public Calculator(){
        // 텍스트 필드 초기화
        tField = new JTextField(35);
        tField.setText("0.");
        tField.setEnabled(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0,5,3,3));

        //버튼 배열 초기화 및 추가
        buttons = new JButton[25];
        int index = 0;
        for(int rows = 0; rows < 5; rows++){
            for(int cols = 0; cols < 5; cols++){
                buttons[index] = new JButton(labels[index]);

                if(cols >= 3) buttons[index].setForeground(Color.red);
                else buttons[index].setForeground(Color.blue);
                buttons[index].setBackground(Color.yellow);
                panel.add(buttons[index]);
                index++;
            }
        }
        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack(); // 컴포넌트 크기에 맞게 프레임 크기 조정
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new Calculator());
    }
}
