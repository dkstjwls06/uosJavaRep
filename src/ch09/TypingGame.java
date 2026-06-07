package ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

// 학교에서 실습은 안 함
public class TypingGame extends JFrame {
    private char currentChar;
    private int score = 0;
    private final Random random = new Random();

    public TypingGame(){
        setTitle("Typing Game");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JLabel charLabel = new JLabel("", SwingConstants.CENTER);
        charLabel.setFont(new Font("Arial",Font.BOLD,50));
        charLabel.setBounds(150,50,100,100);

        JLabel scoreLabel = new JLabel("Score : 0",SwingConstants.LEFT);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN,16));
        scoreLabel.setBounds(10,10,100,30);

        setLayout(null);
        add(charLabel);
        add(scoreLabel);

        generateRandomChar(charLabel);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char typedChar = e.getKeyChar();
                if(typedChar == currentChar){
                    score++;
                    scoreLabel.setText("Score: "+score);
                    generateRandomChar(charLabel);
                }
            }
        });

        setVisible(true);
        setFocusable(true);

    }

    private void generateRandomChar(JLabel label){
        currentChar = (char)('a'+random.nextInt(26));
        label.setText(String.valueOf(currentChar));
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new TypingGame());
    }
}
