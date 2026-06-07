package ch09.miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class Calculator extends JFrame implements ActionListener {
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
    private String opcode;
    private double op1 = 0, op2 = 0;
    private boolean isAfterOpcode;

    public Calculator(){
        // 텍스트 필드 초기화
        tField = new JTextField(35);
        tField.setText("");
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
                buttons[index].addActionListener(this);
                panel.add(buttons[index]);
                index++;
            }
        }
        add(tField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack(); // 컴포넌트 크기에 맞게 프레임 크기 조정
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton) e.getSource();
        String cmd = b.getText();
        String operator = null;
        double operand1= 0, operand2 = 0;

        if(cmd.equals("=")){
            String str = tField.getText();
            StringTokenizer stoken = new StringTokenizer(str, "+-x/", true);
            int n_ops = 0;
            System.out.println("2# number of tokens:" + stoken.countTokens());
            while(stoken.hasMoreTokens()){
                String token = stoken.nextToken();
                System.out.println(token);

                switch (token) {
                    case "+":
                    case "-":
                    case "x":
                    case "/":
                        operator = token;
                        break;
                    default:
                        Double d = Double.parseDouble(token);
                        if (n_ops == 0) {
                            operand1 = d;
                        } else {
                            operand2 = d;
                        }
                        n_ops++;
                        break;
                }
            }
            double ret = 0;
            try {

                switch (operator){
                    case "+":
                        ret = operand1 + operand2; break;
                    case "-":
                        ret = operand1 - operand2; break;
                    case "x":
                        ret = operand1 * operand2; break;
                    case "/":
                        if(operand2 == 0) throw new ArithmeticException();
                        ret = operand1 / operand2; break;
                    default: break;
                }
                System.out.println(ret);
            } catch (ArithmeticException exception){
                tField.setText("정의되지 않은 연산입니다.");
                return;
            }
            tField.setText(""+ret);
        } else if(cmd.equals("C")){
            tField.setText("");
        } else{
            tField.setText(tField.getText() + b.getText());
        }




    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new Calculator());
    }
}
