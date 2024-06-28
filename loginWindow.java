//2024.6.26
//by cjm

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class loginWindow extends JFrame {
    public static void main(String args[]) {
        loginWindow window1 = new loginWindow();
        Container con = window1.getContentPane();
        con.setBackground(Color.white);
        window1.setTitle("图书管理系统登陆页面");
        window1.setSize(400, 140);
        window1.setLocationRelativeTo(null);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗口相关内容

        JPanel loginContentPane = new JPanel();
        loginContentPane.add(Box.createRigidArea(new Dimension(100, 0)));
        loginContentPane.add(new JLabel("账号："));
        loginContentPane.add(new JTextField(13));
        loginContentPane.add(Box.createRigidArea(new Dimension(100, 0)));
        loginContentPane.add(Box.createRigidArea(new Dimension(100, 0)));
        loginContentPane.add(new JLabel("密码："));
        loginContentPane.add(new JPasswordField(13));
        loginContentPane.add(Box.createRigidArea(new Dimension(100, 0)));
        loginContentPane.add(Box.createRigidArea(new Dimension(150, 0)));
        JButton button = new JButton("登录");
        loginContentPane.add(button);
        loginContentPane.add(Box.createRigidArea(new Dimension(150, 0)));
        window1.add(loginContentPane);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                MainWindow mainWindow = new MainWindow();
                Container con = mainWindow.getContentPane();
                con.setBackground(Color.white);
                window1.dispose();
            }
        });

        window1.setVisible(true);
    }
}
