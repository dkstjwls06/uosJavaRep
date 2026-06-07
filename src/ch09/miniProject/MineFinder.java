package ch09.miniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;

public class MineFinder extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton[] buttons;
    private Random random = new Random();
    private HashSet<Integer> mine = new HashSet<>();
    private int remaining = 44;

    public MineFinder(){
        setTitle("지뢰 찾기");
        initFrame();
        setVisible(true);
    }

    public void initFrame(){
        panel = new JPanel(new GridLayout(8,8));
        buttons = new JButton[64];

        while(mine.size() < 20){
            int rand = random.nextInt(64);
            mine.add(rand);
        }

        for(int i=0; i<64; i++){
            buttons[i] = new JButton();
            buttons[i].setPreferredSize(new Dimension(50, 50));
            buttons[i].setFont(new Font("Arial",Font.BOLD,20));
            buttons[i].setForeground(Color.BLACK);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton target = (JButton) e.getSource();

        for(int i : mine){
            if(target==buttons[i]){
                JOptionPane.showMessageDialog(this, "게임 오버!");
                System.exit(0);
            }
        }


        int cnt = getCnt(target);
        System.out.println(cnt);
        target.setText(Integer.toString(cnt));
        target.setEnabled(false);
        remaining--;

        if(remaining == 0){
            JOptionPane.showMessageDialog(this,"승리!");
            System.exit(0);
        }
    }

    private int getCnt(JButton target) {
        int idx = 0, cnt = 0;
        for(int i=0; i<64; i++) {
            if(target.equals(buttons[i])){
                idx = i;
                break;
            }
        }
        int row = idx/8, col = idx % 8;

        // 위쪽 3개, 아래쪽 3개
        for(int i = col - 1; i<= col+1; i++){
            if(i>=0 && i<8 && row-1>=0)
                if(mine.contains(8*(row-1)+i)) cnt++;
            if(i>=0 && i<8 && row+1<8)
                if(mine.contains(8*(row+1)+i)) cnt++;
        }
        // 양옆
        if(col>0) if(mine.contains(8*(row)+col-1)) cnt++;
        if(col<7) if(mine.contains(8*(row)+col+1)) cnt++;
        return cnt;
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new MineFinder());
    }

}
