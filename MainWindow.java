//2024.6.24
//by cjm

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("图书管理系统");
        setSize(564, 424);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗口相关内容

        MainComponents components = new MainComponents(); // 创建面板
        Menu menu = new Menu(); // 创建菜单

        setContentPane(components); // 设置面板
        setJMenuBar(menu.getMenu()); // 设置菜单

        setVisible(true);
    }
}