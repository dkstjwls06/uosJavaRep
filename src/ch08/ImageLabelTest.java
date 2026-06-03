package ch08;

import javax.swing.*;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public ImageLabelTest(){
        setTitle("레이블 테스트");
        setSize(400,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel("Cat");
        ImageIcon icon = new ImageIcon("car.jpg");
        label.setIcon(icon);

        button = new JButton("자세한 정보를 보려면 클릭하세요");
        panel.add(label);
        panel.add(button);

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args){SwingUtilities.invokeLater(()->new ImageLabelTest());}
}
