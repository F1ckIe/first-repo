//2024.6.24
//by cjm

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public static void main(String args[]) {
        MainWindow window1 = new MainWindow();
        Container con = window1.getContentPane(); // 容器
        con.setBackground(Color.white);
        window1.setTitle("图书管理系统");
        window1.setSize(564, 424);
        window1.setLocationRelativeTo(null);
        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗口相关内容
    }

    public MainWindow() {
        Components components = new Components(); // 创建面板
        Menu menu = new Menu(); // 创建菜单

        setContentPane(components); // 设置面板
        setJMenuBar(menu.getMenu()); // 设置菜单
    }
}