package ch09.miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton[] buttons;
    private boolean oTurn = true;
    public TicTacToe(){
        setTitle("Tic-Tac-Toe");
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initFrame();
        setVisible(true);

    }

    public void initFrame(){
        panel = new JPanel(new GridLayout(3,3));
        buttons = new JButton[9];

        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial",Font.BOLD,20));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();

        if(oTurn) {
            oTurn = false;
            button.setText("O");
        } else{
            oTurn = true;
            button.setText("X");
        }
        String winner = isOver();
        if(isOver().equals("O")){
            JOptionPane.showMessageDialog(this,"O 승리");
        } else if(isOver().equals("X")){
            JOptionPane.showMessageDialog(this,"X 승리");
        }
    }

    public String isOver(){
        for (int i = 0; i < 3; i++) {
            // 가로 줄 검사 (빈 칸이 아니면서 3개 텍스트가 같은지)
            if (!buttons[3 * i].getText().equals("") &&
                    buttons[3 * i].getText().equals(buttons[3 * i + 1].getText()) &&
                    buttons[3 * i + 1].getText().equals(buttons[3 * i + 2].getText())) {
                return buttons[3 * i].getText();
            }
            // 세로 줄 검사
            if (!buttons[i].getText().equals("") &&
                    buttons[i].getText().equals(buttons[i + 3].getText()) &&
                    buttons[i + 3].getText().equals(buttons[i + 6].getText())) {
                return buttons[i].getText();
            }
        }
        // 대각선 ↘ 검사
        if (!buttons[0].getText().equals("") &&
                buttons[0].getText().equals(buttons[4].getText()) &&
                buttons[4].getText().equals(buttons[8].getText())) {
            return buttons[0].getText();
        }
        // 대각선 ↙ 검사
        if (!buttons[2].getText().equals("") &&
                buttons[2].getText().equals(buttons[4].getText()) &&
                buttons[4].getText().equals(buttons[6].getText())) {
            return buttons[2].getText();
        }
        return "";
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new TicTacToe());
    }
}
