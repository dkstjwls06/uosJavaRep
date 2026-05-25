package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxImageDemo extends JFrame {
    private JComboBox<String> comboBox;
    private JLabel imageLabel;

    private final String[] imagePaths = {
            "images/dog.jpg",
            "images/bird.jpg",
            "images/cat.jpg"
    };
    public ComboBoxImageDemo(){
        setTitle("ComboBox Image Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLayout(new BorderLayout());

        String[] items = {"Dog","Bird", "Cat"};
        comboBox = new JComboBox<>(items);
        comboBox.addActionListener(new ComboBoxActionListener());

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);

        updateImage(0);

        add(comboBox,BorderLayout.NORTH);
        add(imageLabel,BorderLayout.CENTER);
        setVisible(true);

    }

    private void updateImage(int index){
        ImageIcon icon = new ImageIcon(imagePaths[index]);
        imageLabel.setIcon(icon);
    }

    private class ComboBoxActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int selectedIndex = comboBox.getSelectedIndex();
            updateImage(selectedIndex);
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->new ComboBoxImageDemo());
    }
}
