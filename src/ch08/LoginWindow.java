package ch08;

import javax.swing.*;

public class LoginWindow extends JFrame {
    public LoginWindow(){
        setTitle("Login Window");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);

        panel.add(new JLabel("id   "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("pass"));
        panel.add(new JPasswordField(20));

        JButton login = new JButton("Login");
        panel.add(login);
        JButton cancel = new JButton("Cancel");
        panel.add(cancel);

        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()-> new LoginWindow());
    }
}
